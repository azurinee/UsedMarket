package com.fastcampus.kotlin.usedgoodsmarket.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.fastcampus.kotlin.usedgoodsmarket.R
import com.fastcampus.kotlin.usedgoodsmarket.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var viewBinding : FragmentHomeBinding? = null
    private lateinit var articleAdapter: ArticleAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        articleAdapter = ArticleAdapter()

        val fragmentHomeBinding = FragmentHomeBinding.bind(view)
        viewBinding = fragmentHomeBinding

        articleAdapter.submitList(mutableListOf<ArticleModel>().apply {
            add(ArticleModel(title = "키보드", sellerId = "aaa", createdAt = 220225, price = "70000", imageUrl=""))
            add(ArticleModel(title = "자켓", sellerId = "bbb", createdAt = 220223, price = "55000", imageUrl=""))
        })

        fragmentHomeBinding.articleRecyclerView.layoutManager = LinearLayoutManager(context)
        fragmentHomeBinding.articleRecyclerView.adapter = articleAdapter
    }
}