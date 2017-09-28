import com.nuance.FileCompiler

def call(String project) {
    fc = new FileCompiler(this, project)
    fc.analyze('requirements.txt')
    fc.analyze('setup.py')

    int dblInt = fc.ModuleNewS2('4000')
    println dblInt
}