package o;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import o.C8587ok2;

/* renamed from: o.n90  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8199n90 {
    public static final int a = Color.argb(230, 255, 255, 255);
    public static final int b = Color.argb(128, 27, 27, 27);
    public static InterfaceC10882y90 c;

    public static final void a(ComponentActivity componentActivity) {
        C6562gT0.p(componentActivity, "<this>");
        d(componentActivity, null, null, 3, null);
    }

    public static final void b(ComponentActivity componentActivity, C8587ok2 c8587ok2) {
        C6562gT0.p(componentActivity, "<this>");
        C6562gT0.p(c8587ok2, "statusBarStyle");
        d(componentActivity, c8587ok2, null, 2, null);
    }

    public static final void c(ComponentActivity componentActivity, C8587ok2 c8587ok2, C8587ok2 c8587ok22) {
        C6562gT0.p(componentActivity, "<this>");
        C6562gT0.p(c8587ok2, "statusBarStyle");
        C6562gT0.p(c8587ok22, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        C6562gT0.o(decorView, "getDecorView(...)");
        HA0<Resources, Boolean> e = c8587ok2.e();
        Resources resources = decorView.getResources();
        C6562gT0.o(resources, "getResources(...)");
        boolean booleanValue = e.invoke(resources).booleanValue();
        HA0<Resources, Boolean> e2 = c8587ok22.e();
        Resources resources2 = decorView.getResources();
        C6562gT0.o(resources2, "getResources(...)");
        boolean booleanValue2 = e2.invoke(resources2).booleanValue();
        InterfaceC10882y90 interfaceC10882y90 = c;
        if (interfaceC10882y90 == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 35) {
                interfaceC10882y90 = new C10396w90();
            } else if (i >= 30) {
                interfaceC10882y90 = new C10150v90();
            } else if (i >= 29) {
                interfaceC10882y90 = new C9907u90();
            } else if (i >= 28) {
                interfaceC10882y90 = new C9178r90();
            } else if (i >= 26) {
                interfaceC10882y90 = new C8686p90();
            } else {
                interfaceC10882y90 = new C8442o90();
            }
            c = interfaceC10882y90;
        }
        InterfaceC10882y90 interfaceC10882y902 = interfaceC10882y90;
        Window window = componentActivity.getWindow();
        C6562gT0.o(window, "getWindow(...)");
        interfaceC10882y902.b(c8587ok2, c8587ok22, window, decorView, booleanValue, booleanValue2);
        Window window2 = componentActivity.getWindow();
        C6562gT0.o(window2, "getWindow(...)");
        interfaceC10882y902.a(window2);
    }

    public static /* synthetic */ void d(ComponentActivity componentActivity, C8587ok2 c8587ok2, C8587ok2 c8587ok22, int i, Object obj) {
        if ((i & 1) != 0) {
            c8587ok2 = C8587ok2.a.f(C8587ok2.e, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            c8587ok22 = C8587ok2.a.f(C8587ok2.e, a, b, null, 4, null);
        }
        c(componentActivity, c8587ok2, c8587ok22);
    }

    public static final int e() {
        return b;
    }

    public static final int g() {
        return a;
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void h() {
    }
}
