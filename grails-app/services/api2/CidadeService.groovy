package api2

class CidadeService {
    def getAllCidades() {
        Cidade.list()
    }

    def createCidade(String nome) {
        def cidade = new Cidade(nome: nome)
        cidade.save()
    }
}

