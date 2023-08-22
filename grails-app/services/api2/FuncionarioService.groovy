package api2

class FuncionarioService {
    def getAllFuncionarios() {
        Funcionario.list()
    }

    def createFuncionario(String nome, Cidade cidade) {
        def funcionario = new Funcionario(nome: nome, cidade: cidade)
        funcionario.save()
    }
}

