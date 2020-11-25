package ir.udmx.simplenavigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class HomeFragment : Fragment(R.layout.fragment_home) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val loginBtn = view.findViewById(R.id.loginBtn) as Button
        loginBtn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_loginFragment2)
        }

    }
}