package o;

import android.content.SharedPreferences;

@Deprecated
/* renamed from: o.c42  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5481c42 {

    @Deprecated
    /* renamed from: o.c42$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static a b;
        public final C0263a a = new C0263a();

        /* renamed from: o.c42$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static class C0263a {
            public void a(SharedPreferences.Editor editor) {
                try {
                    editor.apply();
                } catch (AbstractMethodError unused) {
                    editor.commit();
                }
            }
        }

        @Deprecated
        public static a b() {
            if (b == null) {
                b = new a();
            }
            return b;
        }

        @Deprecated
        public void a(SharedPreferences.Editor editor) {
            this.a.a(editor);
        }
    }
}
