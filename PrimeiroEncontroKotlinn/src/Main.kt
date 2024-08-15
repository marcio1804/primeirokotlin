    var version = 5566

fun main(args: Array<String>) {

    //Variaveis mutaveis
    //para isso use a palavra chave var
    var idade = 24
    idade =24

    var nome: String ="Marcio"
    var valor: Double = 5.5
    var peso: Int = 70
    var ePessoa : Boolean = true

    println("Minha idade é $idade e meu peso é $peso")

    //Variaveis imutaveis
    // para isso uso o val
    val pi= 3.14
    val percentualIcms = 19
    val nomeEmpresa: String ="UNIPAR"

    println("version ${version}")
    mudarVersion(50)
    println("version ${version}")

    var total = somarValores(10,20)
    println("total é $total")


}

//Fução void, função sem retorno
//fun nome_funcao(parametros)
fun mudarVersion(versionChange: Int){
    version = versionChange
}

    //Função com retorno

    fun somarValores (valorA: Int, valorB: Int): Int{
        return valorA+valorB
    }