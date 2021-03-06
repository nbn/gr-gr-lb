import org.codehaus.groovy.control.CompilerConfiguration

/**
 * Created by Niels Bech Nielsen on 22-12-2015.
 */
class StockLoad {

    public static void main(String[] args) {
        def file = new File(args ? args[0] : "order1.dsl")
        def compilerConfiguration = new CompilerConfiguration()
        compilerConfiguration.scriptBaseClass = DelegatingScript.name
        def cl = StockDSLDelegate.classLoader
        def shell = new GroovyShell(cl, new Binding(), compilerConfiguration)
        DelegatingScript script = shell.parse(file)
        script.setDelegate new StockDSLDelegate()
        // script.delegate = new StockDSLDelegate() (don't use this one)

        script.run()
    }
}
