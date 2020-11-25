package ir.udmx.simplenavigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_welcome.*


class WelcomeFragment : Fragment(R.layout.fragment_welcome) {
    private val args: WelcomeFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<TextView>(R.id.username_show).text = args.username
        view.findViewById<TextView>(R.id.password_show).text = args.password

        okBtn.setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_welcomeFragment_to_homeFragment)
        }
    }
}