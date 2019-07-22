package br.com.fujioka.livedatadatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.util.*

object FakeRepository {

    private val nomes: List<String> = listOf("Fulano", "Beltrano", "Ciclano", "Joao")

    private val _nomeAtual = MutableLiveData<String>()

    init {
        _nomeAtual.value = nomes.first()
    }

    val nomeAtual : LiveData<String>
        get() = _nomeAtual


    fun getRandomNome() : String {
        val random = Random()
        return nomes[random.nextInt(nomes.size)]
    }

    fun alterarNomeAtual() {
        _nomeAtual.value = getRandomNome()
    }


}