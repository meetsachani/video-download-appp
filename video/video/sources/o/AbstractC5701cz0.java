package o;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: o.cz0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5701cz0<E> extends AbstractC5216az0 {
    public final Activity X;
    public final Context Y;
    public final int Y0;
    public final Handler Z;
    public final FragmentManager Z0;

    public AbstractC5701cz0(Context context, Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
    }

    @Override // o.AbstractC5216az0
    public View d(int i) {
        return null;
    }

    @Override // o.AbstractC5216az0
    public boolean e() {
        return true;
    }

    public Activity f() {
        return this.X;
    }

    public Context g() {
        return this.Y;
    }

    public Handler h() {
        return this.Z;
    }

    public abstract E j();

    public LayoutInflater k() {
        return LayoutInflater.from(this.Y);
    }

    public int l() {
        return this.Y0;
    }

    public boolean m() {
        return true;
    }

    public boolean o(Fragment fragment) {
        return true;
    }

    public boolean p(String str) {
        return false;
    }

    public void q(Fragment fragment, Intent intent, int i) {
        t(fragment, intent, i, null);
    }

    public void t(Fragment fragment, Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C10201vM.A(this.Y, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    @Deprecated
    public void u(Fragment fragment, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        if (i == -1) {
            C5240b5.U(this.X, intentSender, i, intent, i2, i3, i4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }

    public AbstractC5701cz0(ActivityC4864Yy0 activityC4864Yy0) {
        this(activityC4864Yy0, activityC4864Yy0, new Handler(), 0);
    }

    public AbstractC5701cz0(Activity activity, Context context, Handler handler, int i) {
        this.Z0 = new C7654kz0();
        this.X = activity;
        this.Y = (Context) C10907yF1.m(context, "context == null");
        this.Z = (Handler) C10907yF1.m(handler, "handler == null");
        this.Y0 = i;
    }

    public void v() {
    }

    @Deprecated
    public void n(Fragment fragment, String[] strArr, int i) {
    }

    public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
