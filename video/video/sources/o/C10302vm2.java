package o;

import java.nio.CharBuffer;
import java.util.Locale;

/* renamed from: o.vm2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10302vm2 {
    public static final InterfaceC10059um2 a = new e(null, false);
    public static final InterfaceC10059um2 b = new e(null, true);
    public static final InterfaceC10059um2 c;
    public static final InterfaceC10059um2 d;
    public static final InterfaceC10059um2 e;
    public static final InterfaceC10059um2 f;
    public static final int g = 0;
    public static final int h = 1;
    public static final int i = 2;

    /* renamed from: o.vm2$a */
    /* loaded from: classes.dex */
    public static class a implements c {
        public static final a b = new a(true);
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        @Override // o.C10302vm2.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int a = C10302vm2.a(Character.getDirectionality(charSequence.charAt(i)));
                if (a != 0) {
                    if (a == 1) {
                        if (!this.a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i++;
                        z = z;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: o.vm2$b */
    /* loaded from: classes.dex */
    public static class b implements c {
        public static final b a = new b();

        @Override // o.C10302vm2.c
        public int a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C10302vm2.b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: o.vm2$c */
    /* loaded from: classes.dex */
    public interface c {
        int a(CharSequence charSequence, int i, int i2);
    }

    /* renamed from: o.vm2$d */
    /* loaded from: classes.dex */
    public static abstract class d implements InterfaceC10059um2 {
        public final c a;

        public d(c cVar) {
            this.a = cVar;
        }

        public abstract boolean a();

        public final boolean b(CharSequence charSequence, int i, int i2) {
            int a = this.a.a(charSequence, i, i2);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return a();
            }
            return false;
        }

        @Override // o.InterfaceC10059um2
        public boolean isRtl(char[] cArr, int i, int i2) {
            return isRtl(CharBuffer.wrap(cArr), i, i2);
        }

        @Override // o.InterfaceC10059um2
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.a == null) {
                    return a();
                }
                return b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: o.vm2$e */
    /* loaded from: classes.dex */
    public static class e extends d {
        public final boolean b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.b = z;
        }

        @Override // o.C10302vm2.d
        public boolean a() {
            return this.b;
        }
    }

    /* renamed from: o.vm2$f */
    /* loaded from: classes.dex */
    public static class f extends d {
        public static final f b = new f();

        public f() {
            super(null);
        }

        @Override // o.C10302vm2.d
        public boolean a() {
            if (C4823Ym2.a(Locale.getDefault()) == 1) {
                return true;
            }
            return false;
        }
    }

    static {
        b bVar = b.a;
        c = new e(bVar, false);
        d = new e(bVar, true);
        e = new e(a.b, false);
        f = f.b;
    }

    public static int a(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 != 1 && i2 != 2) {
            return 2;
        }
        return 0;
    }

    public static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
