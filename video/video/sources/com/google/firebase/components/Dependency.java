package com.google.firebase.components;

import o.C10829xw0;

/* loaded from: classes3.dex */
public final class Dependency {
    public final Qualified<?> a;
    public final int b;
    public final int c;

    public Dependency(Class<?> cls, int i, int i2) {
        this(Qualified.b(cls), i, i2);
    }

    public static Dependency a(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 2);
    }

    public static Dependency b(Class<?> cls) {
        return new Dependency(cls, 0, 2);
    }

    public static String c(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    return "deferred";
                }
                throw new AssertionError("Unsupported injection: " + i);
            }
            return "provider";
        }
        return "direct";
    }

    @Deprecated
    public static Dependency i(Class<?> cls) {
        return new Dependency(cls, 0, 0);
    }

    public static Dependency j(Qualified<?> qualified) {
        return new Dependency(qualified, 0, 1);
    }

    public static Dependency k(Class<?> cls) {
        return new Dependency(cls, 0, 1);
    }

    public static Dependency l(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 0);
    }

    public static Dependency m(Class<?> cls) {
        return new Dependency(cls, 1, 0);
    }

    public static Dependency n(Qualified<?> qualified) {
        return new Dependency(qualified, 1, 1);
    }

    public static Dependency o(Class<?> cls) {
        return new Dependency(cls, 1, 1);
    }

    public static Dependency p(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 0);
    }

    public static Dependency q(Class<?> cls) {
        return new Dependency(cls, 2, 0);
    }

    public static Dependency r(Qualified<?> qualified) {
        return new Dependency(qualified, 2, 1);
    }

    public static Dependency s(Class<?> cls) {
        return new Dependency(cls, 2, 1);
    }

    public Qualified<?> d() {
        return this.a;
    }

    public boolean e() {
        if (this.c == 2) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dependency) {
            Dependency dependency = (Dependency) obj;
            if (this.a.equals(dependency.a) && this.b == dependency.b && this.c == dependency.c) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        if (this.c == 0) {
            return true;
        }
        return false;
    }

    public boolean g() {
        if (this.b == 1) {
            return true;
        }
        return false;
    }

    public boolean h() {
        if (this.b == 2) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        if (i == 1) {
            str = "required";
        } else if (i == 0) {
            str = "optional";
        } else {
            str = C10829xw0.c;
        }
        sb.append(str);
        sb.append(", injection=");
        sb.append(c(this.c));
        sb.append("}");
        return sb.toString();
    }

    public Dependency(Qualified<?> qualified, int i, int i2) {
        this.a = (Qualified) Preconditions.c(qualified, "Null dependency anInterface.");
        this.b = i;
        this.c = i2;
    }
}
