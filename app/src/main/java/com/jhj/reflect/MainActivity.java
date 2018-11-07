package com.jhj.reflect;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.jhj.reflect.annotation.LimitAge;
import com.jhj.reflect.reflect.ReflectAnnotation;
import com.jhj.reflect.reflect.ReflectConstructor;
import com.jhj.reflect.reflect.ReflectField;
import com.jhj.reflect.reflect.ReflectMethod;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {


    private RadioGroup mRgA;
    private RadioGroup mRgB;
    private TextView mTvInfo;
    private int type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


        mRgA.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rb_constructor:
                        type = 1;
                        break;

                    case R.id.rb_field:
                        type = 2;
                        break;

                    case R.id.rb_method:
                        type = 3;
                        break;

                    case R.id.rb_annotation:
                        type = 4;
                        break;
                }

            }
        });


        mRgB.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                StringBuilder builder;
                switch (checkedId) {
                    case R.id.rb_all_public:
                        switch (type) {

                            case 1:
                                Constructor<?>[] constructors = ReflectConstructor.getConstructors(Animal.class);
                                builder = new StringBuilder();
                                for (Constructor<?> constructor : constructors) {
                                    builder.append(constructor.getName()).append("\n");
                                }
                                setText(builder);
                                break;
                            case 2:
                                Field[] fields = ReflectField.getFields(Animal.class);
                                builder = new StringBuilder();
                                for (Field field : fields) {
                                    builder.append(field.getName()).append("\n");
                                }
                                setText(builder);
                                break;
                            case 3:
                                Method[] methods = ReflectMethod.getMethods(Animal.class);
                                builder = new StringBuilder();
                                for (Method method : methods) {
                                    builder.append(method.getName()).append("\n");
                                }
                                setText(builder);
                                break;

                            case 4:
                                Annotation[] annotations = ReflectAnnotation.getAnnotations(Animal.class);
                                builder = new StringBuilder();
                                for (Annotation annotation : annotations) {
                                    builder.append(annotation.getClass().getName()).append("\n");
                                }
                                setText(builder);
                                break;
                        }
                        break;

                    case R.id.rb_all_public_private:
                        switch (type) {
                            case 1:
                                Constructor<?>[] constructors = ReflectConstructor.getDeclaredConstructors(Animal.class);
                                builder = new StringBuilder();
                                for (Constructor<?> constructor : constructors) {
                                    builder.append(constructor.getName()).append("\n");
                                }
                                setText(builder);
                                break;
                            case 2:
                                Field[] fields = ReflectField.getDeclaredFields(Animal.class);
                                builder = new StringBuilder();
                                for (Field field : fields) {
                                    builder.append(field.getName()).append("\n");
                                }
                                break;
                            case 3:
                                Method[] methods = ReflectMethod.getDeclaredMethods(Animal.class);
                                builder = new StringBuilder();
                                for (Method method : methods) {
                                    builder.append(method.getName()).append("\n");
                                }
                                break;

                            case 4:
                                Annotation[] annotations = ReflectAnnotation.getDeclaredAnnotations(Animal.class);
                                builder = new StringBuilder();
                                for (Annotation annotation : annotations) {
                                    builder.append(annotation.getClass().getName()).append("\n");
                                }
                                setText(builder);
                                break;
                        }

                        break;

                    case R.id.rb_single_public:
                        switch (type) {
                            case 1:
                                Constructor<?> constructor = ReflectConstructor.getConstructor(Animal.class);
                                if (constructor != null) {
                                    setText(constructor.getName());
                                }
                                break;
                            case 2:
                                Field field = ReflectField.getField(Animal.class, "");
                                if (field != null) {
                                    setText(field.getName());
                                }
                                break;
                            case 3:
                                Method method = ReflectMethod.getMethod(Animal.class, "");
                                if (method != null) {
                                    setText(method.getName());
                                }
                                break;

                            case 4:
                                Annotation annotation = ReflectAnnotation.getAnnotation(Animal.class, LimitAge.class);
                                if (annotation != null){
                                    setText(annotation.getClass().getName());
                                }
                                break;
                        }

                        break;

                    case R.id.rb_single_public_private:
                        switch (type) {
                            case 1:
                                Constructor<?> constructor = ReflectConstructor.getDeclaredConstructor(Animal.class);
                                if (constructor != null) {
                                    setText(constructor.getName());
                                }
                                break;
                            case 2:
                                Field field = ReflectField.getDeclaredField(Animal.class, "");
                                if (field != null) {
                                    setText(field.getName());
                                }
                                break;
                            case 3:
                                Method method = ReflectMethod.getDeclaredMethod(Animal.class, "");
                                if (method != null) {
                                    setText(method.getName());
                                }
                                break;

                            case 4:

                                break;
                        }

                        break;
                }

            }
        });

    }


    private void initView() {
        mRgA = (RadioGroup) findViewById(R.id.rg_a);
        mRgB = (RadioGroup) findViewById(R.id.rg_b);
        mTvInfo = (TextView) findViewById(R.id.tv_info);
    }

    private void setText(CharSequence text) {
        if (text == null) {
            mTvInfo.setText("");
        } else {
            mTvInfo.setText(text);
        }
    }
}
