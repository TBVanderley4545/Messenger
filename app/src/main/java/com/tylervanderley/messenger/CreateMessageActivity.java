package com.tylervanderley.messenger;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.EditText;

public class CreateMessageActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_message);
    }

    // Call onSendMessage() when the button is clicked
    public void onSendMessage(View view) {
        // When we click the button, the following happens. 1) The activity looks in the layout to
        // find the EditText with an id of message. 2) The text object is taken from the message
        // view and converted to a string in a String object called messageText. 3) Create a new
        // intent called intent that links to the ReceiveMessageActivity. 4) use the intent.putExtra()
        // method to add the messageText to the intent in an object called "message". 5) Start the
        // next activity by passing in the previously created intent.

        EditText messageView = (EditText) findViewById(R.id.message);
        String messageText = messageView.getText().toString();
        Intent intent = new Intent(this, ReceiveMessageActivity.class);
        intent.putExtra(ReceiveMessageActivity.EXTRA_MESSAGE, messageText);
        startActivity(intent);
    }
}
