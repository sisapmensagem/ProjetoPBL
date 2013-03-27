package sisap

class PeriodoDisciplina {
    static mapWith="mongo"

    Integer ano
    Integer semestre
    Integer sala



    String getPeriodo() {return ano.toString() + "." + semestre.toString()}
    Pessoa professor
    Pessoa autorCadastro
    Disciplina disciplina

    static transients = ['periodo']

    static hasMany = [alunos: Pessoa, atividadesPeriodo: AtividadeAluno]


    static constraints = {
    }

}
