package com.csdelta.haroon.simplecalculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements OnClickListener{

    TextView calcField;
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnDivide,btnMultiply,btnSubtract,btnAdd,btnEqual,btnBracketOpen,btnBracketClose,btnSin,btnCos,btnTan,btnPi,btnNot,btnLog,btnLn,btnE,btnPower,btnSqrt, btnClear;
    String equation = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calcField = (TextView) findViewById(R.id.textViewCalculator);
        btn0 = (Button) findViewById(R.id.zero_btn);
        btn1 = (Button) findViewById(R.id.one_btn);
        btn2 = (Button) findViewById(R.id.two_btn);
        btn3 = (Button) findViewById(R.id.three_btn);
        btn4 = (Button) findViewById(R.id.four_btn);
        btn5 = (Button) findViewById(R.id.five_btn);
        btn6 = (Button) findViewById(R.id.six_btn);
        btn7 = (Button) findViewById(R.id.seven_btn);
        btn8 = (Button) findViewById(R.id.eight_btn);
        btn9 = (Button) findViewById(R.id.nine_btn);
        btnDot = (Button) findViewById(R.id.dot_btn);
        btnDivide = (Button) findViewById(R.id.divide_btn);
        btnMultiply = (Button) findViewById(R.id.X_btn);
        btnSubtract = (Button) findViewById(R.id.subtract_btn);
        btnAdd = (Button) findViewById(R.id.add_btn);
        btnEqual = (Button) findViewById(R.id.equal_btn);
        btnBracketOpen = (Button) findViewById(R.id.bo_btn);
        btnBracketClose = (Button) findViewById(R.id.bc_btn);
        btnSin = (Button) findViewById(R.id.sin_btn);
        btnCos = (Button) findViewById(R.id.cos_btn);
        btnTan = (Button) findViewById(R.id.tan_btn);
        btnPi = (Button) findViewById(R.id.pi_btn);
        btnNot = (Button) findViewById(R.id.not_btn);
        btnLog = (Button) findViewById(R.id.log_btn);
        btnLn = (Button) findViewById(R.id.ln_btn);
        btnClear = (Button) findViewById(R.id.clear_btn);
        btnE = (Button) findViewById(R.id.e_btn);
        btnPower = (Button) findViewById(R.id.power_btn);
        btnSqrt = (Button) findViewById(R.id.sqrt_btn);

        //Setting Onclick Listeners on all buttons
        btn0.setOnClickListener(this);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btnSin.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);
        btnAdd.setOnClickListener(this);
        btnDot.setOnClickListener(this);
        btnDivide.setOnClickListener(this);
        btnMultiply.setOnClickListener(this);
        btnBracketClose.setOnClickListener(this);
        btnBracketOpen.setOnClickListener(this);
        btnPi.setOnClickListener(this);
        btnE.setOnClickListener(this);
        btnLn.setOnClickListener(this);
        btnLog.setOnClickListener(this);
        btnClear.setOnClickListener(this);
        btnPower.setOnClickListener(this);
        btnSqrt.setOnClickListener(this);
        btnNot.setOnClickListener(this);
        btnSubtract.setOnClickListener(this);
        btnEqual.setOnClickListener(this);


        calcField.setText(equation);
    }

    @Override
    public void onClick(View view) {
        //Toast.makeText(this, "Btn clicked", Toast.LENGTH_SHORT).show();
        if (view.getId() == R.id.sin_btn) {
            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
            String equation = calcField.getText().toString();
            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
            equation = equation + "sin()";
            calcField.setText(equation);
        } else {
            if (view.getId() == R.id.cos_btn) {
                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                String equation = calcField.getText().toString();
                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                equation = equation + "cos()";
                calcField.setText(equation);
            } else {

                if (view.getId() == R.id.tan_btn) {
                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                    String equation = calcField.getText().toString();
                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                    equation = equation + "tan()";
                    calcField.setText(equation);
                } else {
                    if (view.getId() == R.id.pi_btn) {
                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                        String equation = calcField.getText().toString();
                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                        equation = equation + "PI";
                        calcField.setText(equation);
                    } else {
                        if (view.getId() == R.id.not_btn) {
                            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                            String equation = calcField.getText().toString();
                            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                            equation = equation + "!";
                            calcField.setText(equation);
                        } else {
                            if (view.getId() == R.id.ln_btn) {
                                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                String equation = calcField.getText().toString();
                                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                equation = equation + "ln";
                                calcField.setText(equation);
                            } else {
                                if (view.getId() == R.id.log_btn) {
                                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                    String equation = calcField.getText().toString();
                                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                    equation = equation + "log";
                                    calcField.setText(equation);
                                } else {
                                    if (view.getId() == R.id.e_btn) {
                                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                        String equation = calcField.getText().toString();
                                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                        equation = equation + "e";
                                        calcField.setText(equation);
                                    } else {

                                        if (view.getId() == R.id.power_btn) {
                                            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                            String equation = calcField.getText().toString();
                                            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                            equation = equation + "^";
                                            calcField.setText(equation);
                                        } else {

                                            if (view.getId() == R.id.sqrt_btn) {
                                                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                String equation = calcField.getText().toString();
                                                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                equation = equation + "sqrt";
                                                calcField.setText(equation);
                                            } else {

                                                if (view.getId() == R.id.seven_btn) {
                                                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                    String equation = calcField.getText().toString();
                                                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                    equation = equation + "7";
                                                    calcField.setText(equation);
                                                } else {

                                                    if (view.getId() == R.id.eight_btn) {
                                                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                        String equation = calcField.getText().toString();
                                                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                        equation = equation + "8";
                                                        calcField.setText(equation);
                                                    } else {

                                                        if (view.getId() == R.id.nine_btn) {
                                                            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                            String equation = calcField.getText().toString();
                                                            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                            equation = equation + "9";
                                                            calcField.setText(equation);
                                                        } else {

                                                            if (view.getId() == R.id.divide_btn) {
                                                                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                String equation = calcField.getText().toString();
                                                                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                equation = equation + "/";
                                                                calcField.setText(equation);
                                                            } else {

                                                                if (view.getId() == R.id.bo_btn) {
                                                                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                    String equation = calcField.getText().toString();
                                                                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                    equation = equation + "(";
                                                                    calcField.setText(equation);
                                                                } else {

                                                                    if (view.getId() == R.id.bc_btn) {
                                                                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                        String equation = calcField.getText().toString();
                                                                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                        equation = equation + ")";
                                                                        calcField.setText(equation);
                                                                    } else {

                                                                        if (view.getId() == R.id.four_btn) {
                                                                            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                            String equation = calcField.getText().toString();
                                                                            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                            equation = equation + "4";
                                                                            calcField.setText(equation);
                                                                        } else {

                                                                            if (view.getId() == R.id.five_btn) {
                                                                                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                String equation = calcField.getText().toString();
                                                                                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                equation = equation + "5";
                                                                                calcField.setText(equation);
                                                                            } else {

                                                                                if (view.getId() == R.id.six_btn) {
                                                                                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                    String equation = calcField.getText().toString();
                                                                                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                    equation = equation + "6";
                                                                                    calcField.setText(equation);
                                                                                } else {

                                                                                    if (view.getId() == R.id.X_btn) {
                                                                                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                        String equation = calcField.getText().toString();
                                                                                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                        equation = equation + "x";
                                                                                        calcField.setText(equation);
                                                                                    } else {

                                                                                        if (view.getId() == R.id.one_btn) {
                                                                                            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                            String equation = calcField.getText().toString();
                                                                                            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                            equation = equation + "1";
                                                                                            calcField.setText(equation);
                                                                                        } else {

                                                                                            if (view.getId() == R.id.two_btn) {
                                                                                                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                String equation = calcField.getText().toString();
                                                                                                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                equation = equation + "2";
                                                                                                calcField.setText(equation);
                                                                                            } else {

                                                                                                if (view.getId() == R.id.three_btn) {
                                                                                                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                    String equation = calcField.getText().toString();
                                                                                                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                    equation = equation + "3";
                                                                                                    calcField.setText(equation);
                                                                                                } else {

                                                                                                    if (view.getId() == R.id.subtract_btn) {
                                                                                                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                        String equation = calcField.getText().toString();
                                                                                                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                        equation = equation + "-";
                                                                                                        calcField.setText(equation);
                                                                                                    } else {

                                                                                                        if (view.getId() == R.id.add_btn) {
                                                                                                            //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                            String equation = calcField.getText().toString();
                                                                                                            //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                            equation = equation + "+";
                                                                                                            calcField.setText(equation);
                                                                                                        } else {

                                                                                                            if (view.getId() == R.id.zero_btn) {
                                                                                                                //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                                String equation = calcField.getText().toString();
                                                                                                                //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                                equation = equation + "0";
                                                                                                                calcField.setText(equation);
                                                                                                            } else {

                                                                                                                if (view.getId() == R.id.dot_btn) {
                                                                                                                    //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                                    String equation = calcField.getText().toString();
                                                                                                                    //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                                    equation = equation + ".";
                                                                                                                    calcField.setText(equation);
                                                                                                                } else {

                                                                                                                    if (view.getId() == R.id.equal_btn) {
                                                                                                                        Toast.makeText(this, "Equal clicked", Toast.LENGTH_LONG).show();
                                                                                                                        String equation = calcField.getText().toString();
                                                                                                                        //Toast.makeText(this, equation, Toast.LENGTH_LONG).show();
                                                                                                                        equation = equation + "=";
                                                                                                                        calcField.setText(equation);
                                                                                                                    }
                                                                                                                    if (view.getId() == R.id.clear_btn) {
                                                                                                                        //Toast.makeText(this, "Cos clicked", Toast.LENGTH_LONG).show();
                                                                                                                        String equation;
                                                                                                                        Toast.makeText(this, "Clear", Toast.LENGTH_LONG).show();
                                                                                                                        equation = "";
                                                                                                                        calcField.setText(equation);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }

                                }

                            }

                        }

                    }

                }
            }

        }

    }
}
