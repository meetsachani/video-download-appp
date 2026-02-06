package o;

import android.os.Bundle;
import android.view.View;

/* loaded from: classes.dex */
public interface G4 {

    /* loaded from: classes.dex */
    public static abstract class a {
        public Bundle a;

        public void a(Bundle bundle) {
            this.a = bundle;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends a {
        public boolean b() {
            return this.a.getBoolean(C10861y4.Z);
        }

        public int c() {
            return this.a.getInt(C10861y4.X);
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {
        public String b() {
            return this.a.getString(C10861y4.Y);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends a {
        public int b() {
            return this.a.getInt(C10861y4.g0);
        }

        public int c() {
            return this.a.getInt(C10861y4.h0);
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends a {
        public int b() {
            return this.a.getInt(C10861y4.e0);
        }

        public int c() {
            return this.a.getInt(C10861y4.d0);
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends a {
        public float b() {
            return this.a.getFloat(C10861y4.f0);
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends a {
        public int b() {
            return this.a.getInt(C10861y4.b0);
        }

        public int c() {
            return this.a.getInt(C10861y4.a0);
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends a {
        public CharSequence b() {
            return this.a.getCharSequence(C10861y4.c0);
        }
    }

    boolean a(View view, a aVar);
}
