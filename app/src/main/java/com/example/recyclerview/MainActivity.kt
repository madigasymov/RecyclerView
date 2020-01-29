package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.vh_message.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMessages.adapter = ChatAdapter(generateMockChatModels())
        rvMessages.layoutManager = LinearLayoutManager(this)
        rvMessages.addItemDecoration(MyDivider(this, ContextCompat.getDrawable(this, R.drawable.divider_drawable)!!))
    }

    private fun generateMockChatModels(): List<ChatModel> {
        val list = ArrayList<ChatModel>()
        list.add(
            ChatModel(
            "https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", "Andy", "From NY", Date(), 5
        )
        )
        list.add(
            ChatModel(
                "https://images.squarespace-cdn.com/content/v1/5bf5d5da506fbea76ffa4abe/1547249524951-CQ5U440SQYT23ODKL23G/ke17ZwdGBToddI8pDm48kKAwwdAfKsTlKsCcElEApLR7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UegTYNQkRo-Jk4EWsyBNhwKrKLo5CceA1-Tdpfgyxoog5ck0MD3_q0rY3jFJjjoLbQ/yenyi.jpg", "Darkhan", "5465465456454", Date(), 1
            )
        )
        list.add(
            ChatModel(
                "https://xontab.com/experiments/Javascript/Image%20Browser/image5.jpg", "Zarina", "Asd 123", Date(), 2
            )
        )
        list.add(
            ChatModel(
                "https://www.hd-freewallpapers.com/latest-wallpapers/desktop-image-of-a-parrot-wallpaper.jpg", "Bob Marley", "Give it!", Date(), 512
            )
        )
        list.add(
            ChatModel(
                "https://interactive-examples.mdn.mozilla.net/media/examples/grapefruit-slice-332-332.jpg", "Mandarin", "Eat me!", Date(), 999
            )
        )
        list.add(
            ChatModel(
                "https://as.ftcdn.net/r/v1/pics/7b11b8176a3611dbfb25406156a6ef50cd3a5009/home/discover_collections/optimized/image-2019-10-11-11-36-27-681.jpg", "Andy", "From NY", Date(), 5
            )
        )
        list.add(
            ChatModel(
                "https://oc1.ocstatic.com/images/logo_small.png", "Darkhan", "5465465456454", Date(), 1
            )
        )
        list.add(
            ChatModel(
                "https://www.processing.org/tutorials/pixels/imgs/tint1.jpg", "Zarina", "Asd 123", Date(), 2
            )
        )
        list.add(
            ChatModel(
                "https://cdn.mos.cms.futurecdn.net/KFJobyFBKpGh3ULKbKVtHj-320-80.jpg", "Bob Marley", "Give it!", Date(), 512
            )
        )
        list.add(
            ChatModel(
                "https://www.ltutech.com/wp-content/uploads/2019/03/color-search-470x392.jpg", "Mandarin", "Eat me!", Date(), 999
            )
        )
        list.add(
            ChatModel(
                "https://media.geeksforgeeks.org/wp-content/uploads/20190719161521/core.jpg", "Andy", "From NY", Date(), 5
            )
        )
        list.add(
            ChatModel(
                "https://images.squarespace-cdn.com/content/v1/5bf5d5da506fbea76ffa4abe/1547249524951-CQ5U440SQYT23ODKL23G/ke17ZwdGBToddI8pDm48kKAwwdAfKsTlKsCcElEApLR7gQa3H78H3Y0txjaiv_0fDoOvxcdMmMKkDsyUqMSsMWxHk725yiiHCCLfrh8O1z5QPOohDIaIeljMHgDF5CVlOqpeNLcJ80NK65_fV7S1UegTYNQkRo-Jk4EWsyBNhwKrKLo5CceA1-Tdpfgyxoog5ck0MD3_q0rY3jFJjjoLbQ/yenyi.jpg", "Darkhan", "5465465456454", Date(), 1
            )
        )
        list.add(
            ChatModel(
                "https://xontab.com/experiments/Javascript/Image%20Browser/image5.jpg", "Zarina", "Asd 123", Date(), 2
            )
        )
        list.add(
            ChatModel(
                "https://www.hd-freewallpapers.com/latest-wallpapers/desktop-image-of-a-parrot-wallpaper.jpg", "Bob Marley", "Give it!", Date(), 512
            )
        )
        list.add(
            ChatModel(
                "https://interactive-examples.mdn.mozilla.net/media/examples/grapefruit-slice-332-332.jpg", "Mandarin", "Eat me!", Date(), 999
            )
        )
        list.add(
            ChatModel(
                "https://as.ftcdn.net/r/v1/pics/7b11b8176a3611dbfb25406156a6ef50cd3a5009/home/discover_collections/optimized/image-2019-10-11-11-36-27-681.jpg", "Andy", "From NY", Date(), 5
            )
        )
        list.add(
            ChatModel(
                "https://oc1.ocstatic.com/images/logo_small.png", "Darkhan", "5465465456454", Date(), 1
            )
        )
        list.add(
            ChatModel(
                "https://www.processing.org/tutorials/pixels/imgs/tint1.jpg", "Zarina", "Asd 123", Date(), 2
            )
        )
        list.add(
            ChatModel(
                "https://cdn.mos.cms.futurecdn.net/KFJobyFBKpGh3ULKbKVtHj-320-80.jpg", "Bob Marley", "Give it!", Date(), 512
            )
        )
        list.add(
            ChatModel(
                "https://www.ltutech.com/wp-content/uploads/2019/03/color-search-470x392.jpg", "Mandarin", "Eat me!", Date(), 999
            )
        )
        return list
    }
}
