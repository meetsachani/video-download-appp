package o;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.f;
import o.C9271rX0;

/* renamed from: o.qI  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class ActivityC8964qI extends Activity implements KZ0, C9271rX0.a {
    public final C9654t62<Class<? extends a>, a> X = new C9654t62<>(0, 1, null);
    public final androidx.lifecycle.j Y = new androidx.lifecycle.j(this);

    @InterfaceC9150r20(message = "Store the object you want to save directly by using\n      {@link View#setTag(int, Object)} with the window's decor view.")
    /* renamed from: o.qI$a */
    /* loaded from: classes.dex */
    public static class a {
    }

    @Override // o.C9271rX0.a
    public boolean I(KeyEvent keyEvent) {
        C6562gT0.p(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }

    public androidx.lifecycle.f b() {
        return this.Y;
    }

    @InterfaceC9150r20(message = "Use {@link View#getTag(int)} with the window's decor view.")
    public <T extends a> T b0(Class<T> cls) {
        C6562gT0.p(cls, "extraDataClass");
        return (T) this.X.get(cls);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C6562gT0.p(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "window.decorView");
        if (C9271rX0.d(decorView, keyEvent)) {
            return true;
        }
        return C9271rX0.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        C6562gT0.p(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        C6562gT0.o(decorView, "window.decorView");
        if (C9271rX0.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC9150r20(message = "Use {@link View#setTag(int, Object)} with the window's decor view.")
    public void e0(a aVar) {
        C6562gT0.p(aVar, "extraData");
        this.X.put(aVar.getClass(), aVar);
    }

    public final boolean g0(String[] strArr) {
        return !h0(strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x003a, code lost:
        if (r4.equals("--list-dumpables") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r4.equals("--dump-dumpable") == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h0(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return true;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (!str.equals("--contentcapture") || Build.VERSION.SDK_INT < 29) {
                        return false;
                    }
                    return true;
                case 1455016274:
                    if (!str.equals("--autofill") || Build.VERSION.SDK_INT < 26) {
                        return false;
                    }
                    return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.lifecycle.o.Y.d(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        C6562gT0.p(bundle, "outState");
        this.Y.s(f.b.CREATED);
        super.onSaveInstanceState(bundle);
    }

    public static /* synthetic */ void c0() {
    }

    public static /* synthetic */ void d0() {
    }
}
