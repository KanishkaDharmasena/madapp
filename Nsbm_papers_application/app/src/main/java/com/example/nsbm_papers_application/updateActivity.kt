package com.example.nsbm_papers_application

        import androidx.appcompat.app.AppCompatActivity
                import android.os.Bundle
        import android.widget.Button
        import android.widget.EditText
        import android.widget.Toast
        import com.example.nsbm_papers_application.databinding.ActivityUpdateBinding
        import com.google.firebase.auth.FirebaseAuth
        import com.google.firebase.database.DatabaseReference
                import com.google.firebase.database.FirebaseDatabase


        class updateActivity : AppCompatActivity() {

            private lateinit var binding: ActivityUpdateBinding
            private lateinit var database : DatabaseReference
            private lateinit var mauth: FirebaseAuth

            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)

                binding = ActivityUpdateBinding .inflate(layoutInflater)
                setContentView(binding.root)

                binding.updateBtn.setOnClickListener {





                    mauth= FirebaseAuth.getInstance()
                    val firstName = binding.firstName.text.toString()
                    val lastName = binding.lastname.text.toString()
                    val batch = binding.batch.text.toString()


                    if(firstName.isEmpty()){
                        Toast.makeText(this@updateActivity,"Fill the first name ",Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }
                    else if(lastName.isEmpty()){
                        Toast.makeText(this@updateActivity,"Fill the last name ",Toast.LENGTH_SHORT).show()
                        return@setOnClickListener
                    }

                    else if(batch.isEmpty()) {
                        Toast.makeText(
                            this@updateActivity,
                            "Fill the Batch number ",
                            Toast.LENGTH_SHORT
                        ).show()
                        return@setOnClickListener
                    }
                        else{

                            updateData(firstName, lastName, batch, mauth.currentUser?.uid!!)
                        }
                    }

                }

            

            private fun updateData(firstname: String, lastname: String, batch: String,uid:String) {

                database = FirebaseDatabase.getInstance().getReference("user")
                val user = mapOf<String,String>(
                    "fristname" to firstname,
                    "lastname" to lastname,
                    "batch" to batch
                )

                database.child(uid).updateChildren(user).addOnSuccessListener {

                    binding.firstName.text.clear()
                    binding.lastname.text.clear()
                    binding.batch.text.clear()
                    Toast.makeText(this,"Successfuly Updated", Toast.LENGTH_SHORT).show()


                }.addOnFailureListener{

                    Toast.makeText(this,"Failed to Update", Toast.LENGTH_SHORT).show()

                }}
        }