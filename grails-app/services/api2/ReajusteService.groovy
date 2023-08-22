package api2

class ReajusteService {
    def getAllReajustes() {
        Reajuste.list()
    }

    def createReajuste(BigDecimal valor, Funcionario funcionario) {
        def reajuste = new Reajuste(valor: valor, funcionario: funcionario)
        reajuste.save()
    }
}

