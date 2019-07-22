package br.com.fujioka.livedatadatabinding

import androidx.databinding.Bindable
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    // Busco do fake do repository a variavel nome atual que foi atualizada pelo metodo alterar nome
    val nomeAtual : LiveData<String>
        get() = FakeRepository.nomeAtual

    // Chamo o método alterar nome atual que atribui a variavel nomeAtual do FAKE REPOSITORY
    fun onClickMostrarNome() = FakeRepository.alterarNomeAtual()

    @Bindable
    val editTextNomeNovo = MutableLiveData<String>()

}