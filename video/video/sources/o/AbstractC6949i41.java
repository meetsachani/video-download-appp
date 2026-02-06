package o;

import android.util.Log;

/* renamed from: o.i41  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6949i41 {
    public static AbstractC6949i41 a = null;
    public static final String b = "WM-";
    public static final int c = 23;
    public static final int d = 20;

    /* renamed from: o.i41$a */
    /* loaded from: classes.dex */
    public static class a extends AbstractC6949i41 {
        public int e;

        public a(int loggingLevel) {
            super(loggingLevel);
            this.e = loggingLevel;
        }

        @Override // o.AbstractC6949i41
        public void a(String tag, String message, Throwable... throwables) {
            if (this.e <= 3) {
                if (throwables != null && throwables.length >= 1) {
                    Log.d(tag, message, throwables[0]);
                } else {
                    Log.d(tag, message);
                }
            }
        }

        @Override // o.AbstractC6949i41
        public void b(String tag, String message, Throwable... throwables) {
            if (this.e <= 6) {
                if (throwables != null && throwables.length >= 1) {
                    Log.e(tag, message, throwables[0]);
                } else {
                    Log.e(tag, message);
                }
            }
        }

        @Override // o.AbstractC6949i41
        public void d(String tag, String message, Throwable... throwables) {
            if (this.e <= 4) {
                if (throwables != null && throwables.length >= 1) {
                    Log.i(tag, message, throwables[0]);
                } else {
                    Log.i(tag, message);
                }
            }
        }

        @Override // o.AbstractC6949i41
        public void g(String tag, String message, Throwable... throwables) {
            if (this.e <= 2) {
                if (throwables != null && throwables.length >= 1) {
                    Log.v(tag, message, throwables[0]);
                } else {
                    Log.v(tag, message);
                }
            }
        }

        @Override // o.AbstractC6949i41
        public void h(String tag, String message, Throwable... throwables) {
            if (this.e <= 5) {
                if (throwables != null && throwables.length >= 1) {
                    Log.w(tag, message, throwables[0]);
                } else {
                    Log.w(tag, message);
                }
            }
        }
    }

    public AbstractC6949i41(int loggingLevel) {
    }

    public static synchronized AbstractC6949i41 c() {
        AbstractC6949i41 abstractC6949i41;
        synchronized (AbstractC6949i41.class) {
            try {
                if (a == null) {
                    a = new a(3);
                }
                abstractC6949i41 = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractC6949i41;
    }

    public static synchronized void e(AbstractC6949i41 logger) {
        synchronized (AbstractC6949i41.class) {
            a = logger;
        }
    }

    public static String f(String tag) {
        int length = tag.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append(b);
        int i = d;
        if (length >= i) {
            sb.append(tag.substring(0, i));
        } else {
            sb.append(tag);
        }
        return sb.toString();
    }

    public abstract void a(String tag, String message, Throwable... throwables);

    public abstract void b(String tag, String message, Throwable... throwables);

    public abstract void d(String tag, String message, Throwable... throwables);

    public abstract void g(String tag, String message, Throwable... throwables);

    public abstract void h(String tag, String message, Throwable... throwables);
}
