package o;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public abstract class O5<I, O> {

    /* loaded from: classes.dex */
    public static final class a<T> {
        public final T a;

        public a(T t) {
            this.a = t;
        }

        public final T a() {
            return this.a;
        }
    }

    public abstract Intent a(Context context, I i);

    public a<O> b(Context context, I i) {
        C6562gT0.p(context, "context");
        return null;
    }

    public abstract O c(int i, Intent intent);
}
