import com.google.i18n.phonenumbers.PhoneNumberUtil

// Place your Spring DSL code here
beans = {

    // Whenever you meat a static factory (i.e. with getInstance() )
    // It is better to insert it here as a bean, because that would make
    // it easier to mock test, and actually deferring the static scope can
    // subsequently pay off.

    phoneUtil(PhoneNumberUtil) { bean ->
        bean.factoryMethod = "getInstance"
        bean.scope = "singleton"
    }
}
