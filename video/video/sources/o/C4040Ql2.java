package o;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.Ql2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4040Ql2 implements Iterable<Intent> {
    public static final String Z = "TaskStackBuilder";
    public final ArrayList<Intent> X = new ArrayList<>();
    public final Context Y;

    /* renamed from: o.Ql2$a */
    /* loaded from: classes.dex */
    public interface a {
        Intent z();
    }

    public C4040Ql2(Context context) {
        this.Y = context;
    }

    public static C4040Ql2 j(Context context) {
        return new C4040Ql2(context);
    }

    @Deprecated
    public static C4040Ql2 l(Context context) {
        return j(context);
    }

    public PendingIntent B(int i, int i2) {
        return D(i, i2, null);
    }

    public PendingIntent D(int i, int i2, Bundle bundle) {
        if (!this.X.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.X.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            return PendingIntent.getActivities(this.Y, i, intentArr, i2, bundle);
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
    }

    public PendingIntent F(int i, int i2, Bundle bundle, boolean z) {
        return D(i, C9191rC1.a(z, i2), bundle);
    }

    public PendingIntent G(int i, int i2, boolean z) {
        return B(i, C9191rC1.a(z, i2));
    }

    public void H() {
        J(null);
    }

    public void J(Bundle bundle) {
        if (!this.X.isEmpty()) {
            Intent[] intentArr = (Intent[]) this.X.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            if (!C10201vM.z(this.Y, intentArr, bundle)) {
                Intent intent = new Intent(intentArr[intentArr.length - 1]);
                intent.addFlags(268435456);
                this.Y.startActivity(intent);
                return;
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }

    public C4040Ql2 d(Intent intent) {
        this.X.add(intent);
        return this;
    }

    public C4040Ql2 e(Intent intent) {
        ComponentName component = intent.getComponent();
        if (component == null) {
            component = intent.resolveActivity(this.Y.getPackageManager());
        }
        if (component != null) {
            h(component);
        }
        d(intent);
        return this;
    }

    public C4040Ql2 f(Activity activity) {
        Intent intent;
        if (activity instanceof a) {
            intent = ((a) activity).z();
        } else {
            intent = null;
        }
        if (intent == null) {
            intent = C2867Eo1.a(activity);
        }
        if (intent != null) {
            ComponentName component = intent.getComponent();
            if (component == null) {
                component = intent.resolveActivity(this.Y.getPackageManager());
            }
            h(component);
            d(intent);
        }
        return this;
    }

    public C4040Ql2 h(ComponentName componentName) {
        int size = this.X.size();
        try {
            Intent b = C2867Eo1.b(this.Y, componentName);
            while (b != null) {
                this.X.add(size, b);
                b = C2867Eo1.b(this.Y, b.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(Z, "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e);
        }
    }

    public C4040Ql2 i(Class<?> cls) {
        return h(new ComponentName(this.Y, cls));
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.X.iterator();
    }

    public Intent k(int i) {
        return this.X.get(i);
    }

    @Deprecated
    public Intent p(int i) {
        return k(i);
    }

    public int r() {
        return this.X.size();
    }

    public Intent[] w() {
        int size = this.X.size();
        Intent[] intentArr = new Intent[size];
        if (size != 0) {
            intentArr[0] = new Intent(this.X.get(0)).addFlags(268484608);
            for (int i = 1; i < size; i++) {
                intentArr[i] = new Intent(this.X.get(i));
            }
        }
        return intentArr;
    }
}
