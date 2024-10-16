package com.example.tasklist

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity1 : AppCompatActivity() {

    private lateinit var recyclerViewTarefas: RecyclerView
    private lateinit var tarefaAdapter: TaskAdapter
    private val listaTarefas = mutableListOf<Task.Tarefa>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)

        recyclerViewTarefas = findViewById(R.id.recyclerViewTarefas)
        tarefaAdapter = TaskAdapter(listaTarefas)
        recyclerViewTarefas.adapter = tarefaAdapter
        recyclerViewTarefas.layoutManager = LinearLayoutManager(this)

        listaTarefas.add(Task.Tarefa("Comprar leite"))
        listaTarefas.add(Task.Tarefa("Estudar Kotlin"))
        listaTarefas.add(Task.Tarefa("Fazer exercícios"))
        tarefaAdapter.notifyDataSetChanged()
    }
}