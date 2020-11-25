package ir.udmx.simplenavigationcomponent

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_login.*


class LoginFragment : Fragment(R.layout.fragment_login) {
    private val args: LoginFragmentArgs by navArgs()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val usernameDeepLink = args.username
        username.setText(usernameDeepLink)

        val signInBtn = view.findViewById(R.id.signInBtn) as Button
        signInBtn.setOnClickListener {
            val username = view.findViewById<EditText>(R.id.username).text.toString()
            val password = view.findViewById<EditText>(R.id.password).text.toString()
            val action = LoginFragmentDirections.actionLoginFragment2ToWelcomeFragment(username, password = password)
            Navigation.findNavController(view).navigate(action)
        }
    }
}