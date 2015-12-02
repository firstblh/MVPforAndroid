package com.firstblh.mvpforandroid;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.firstblh.mvpforandroid.Presenter.UserPresenter;
import com.firstblh.mvpforandroid.View.IUserView;


public class MainActivity extends AppCompatActivity implements IUserView, View.OnClickListener {
    private UserPresenter userPresenter;
    private EditText etId, etName, etAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etId = (EditText) this.findViewById(R.id.id);
        etName = (EditText) this.findViewById(R.id.username);
        etAge = (EditText) this.findViewById(R.id.age);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.findViewById(R.id.btn_save).setOnClickListener(this);
        this.findViewById(R.id.btn_read).setOnClickListener(this);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        userPresenter = new UserPresenter(this);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {

            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public int getId() {
        return Integer.parseInt(etId.getText().toString());
    }

    @Override
    public String getName() {
        return etName.getText().toString();
    }

    @Override
    public int getAge() {
        return Integer.parseInt(etAge.getText().toString());
    }

    @Override
    public void setName(String name) {
        etName.setText(name);

    }

    @Override
    public void setAge(int age) {
        etAge.setText(age+"");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_save:
                userPresenter.saveUser(getId(), getName(), getAge());
                break;
            case R.id.btn_read:
                userPresenter.loadUser(getId());
                break;
        }

    }
}
