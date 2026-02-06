package o;

import android.util.Log;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.text.DecimalFormat;

/* loaded from: classes.dex */
public class OK {
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    public static final int k = 9;
    public static final int l = 10;
    public static int m = 25;
    public static final String n = new String(new char[25]).replace((char) 0, ' ');
    public final C3641Mj1 a;
    public ConstraintLayout b;

    public OK(ConstraintLayout constraintLayout) {
        this.a = new C3641Mj1();
        a(constraintLayout);
    }

    public void a(ConstraintLayout constraintLayout) {
        constraintLayout.l(this.a);
        this.b = constraintLayout;
    }

    /* renamed from: b */
    public OK clone() {
        return new OK(this);
    }

    public final String c(DecimalFormat decimalFormat, OK ok, int i2) {
        String str = f(decimalFormat, ((float) h(i2)) * 1.0E-6f, 7) + B8.d + f(decimalFormat, ((float) ok.h(i2)) * 1.0E-6f, 7) + "ms";
        String str2 = n + g(i2);
        return "CL Perf: " + (str2.substring(str2.length() - m) + " = ") + str;
    }

    public final String d(OK ok, int i2) {
        String str = h(i2) + B8.d + ok.h(i2);
        String str2 = n + g(i2);
        return "CL Perf: " + (str2.substring(str2.length() - m) + " = ") + str;
    }

    public void e() {
        ConstraintLayout constraintLayout = this.b;
        if (constraintLayout != null) {
            constraintLayout.l(null);
        }
    }

    public final String f(DecimalFormat decimalFormat, float f2, int i2) {
        String str = new String(new char[i2]).replace((char) 0, ' ') + decimalFormat.format(f2);
        return str.substring(str.length() - i2);
    }

    public String g(int i2) {
        switch (i2) {
            case 1:
                return "NumberOfLayouts";
            case 2:
                return "MeasureCalls";
            case 3:
                return "ChildCount";
            case 4:
                return "ChildrenMeasures";
            case 5:
                return "MeasuresWidgetsDuration ";
            case 6:
                return "MeasureDuration";
            case 7:
                return "MeasuresLayoutDuration";
            case 8:
                return "SolverVariables";
            case 9:
                return "SolverEquations";
            case 10:
                return "SimpleEquations";
            default:
                return "";
        }
    }

    public long h(int i2) {
        switch (i2) {
            case 1:
                return this.a.M;
            case 2:
                return this.a.Q;
            case 3:
                return this.a.P;
            case 4:
                return this.a.N;
            case 5:
                return this.a.a;
            case 6:
                return this.a.O;
            case 7:
                return this.a.b;
            case 8:
                return this.a.T;
            case 9:
                return this.a.S;
            case 10:
                return this.a.U;
            default:
                return 0L;
        }
    }

    public final String i(int i2) {
        String l2 = Long.toString(h(i2));
        String str = n + g(i2);
        return "CL Perf: " + (str.substring(str.length() - m) + " = ") + l2;
    }

    public final String j(DecimalFormat decimalFormat, int i2) {
        String f2 = f(decimalFormat, ((float) h(i2)) * 1.0E-6f, 7);
        String str = n + g(i2);
        return "CL Perf: " + (str.substring(str.length() - m) + " = ") + f2;
    }

    public final void k(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[2];
        Log.v(str, "CL Perf: --------  Performance .(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")  ------ ");
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        Log.v(str, j(decimalFormat, 5));
        Log.v(str, j(decimalFormat, 7));
        Log.v(str, j(decimalFormat, 6));
        Log.v(str, i(1));
        Log.v(str, i(2));
        Log.v(str, i(3));
        Log.v(str, i(4));
        Log.v(str, i(8));
        Log.v(str, i(9));
        Log.v(str, i(10));
    }

    public void l(String str) {
        k(str);
    }

    public void m(String str, OK ok) {
        if (ok == null) {
            k(str);
            return;
        }
        DecimalFormat decimalFormat = new DecimalFormat("###.000");
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        Log.v(str, "CL Perf: -=  Performance .(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ")  =- ");
        Log.v(str, c(decimalFormat, ok, 5));
        Log.v(str, c(decimalFormat, ok, 7));
        Log.v(str, c(decimalFormat, ok, 6));
        Log.v(str, d(ok, 1));
        Log.v(str, d(ok, 2));
        Log.v(str, d(ok, 3));
        Log.v(str, d(ok, 4));
        Log.v(str, d(ok, 8));
        Log.v(str, d(ok, 9));
        Log.v(str, d(ok, 10));
    }

    public void n() {
        this.a.b();
    }

    public OK(OK ok) {
        C3641Mj1 c3641Mj1 = new C3641Mj1();
        this.a = c3641Mj1;
        c3641Mj1.a(ok.a);
    }
}
