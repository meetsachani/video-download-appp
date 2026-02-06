package o;

/* renamed from: o.jv1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7396jv1 {
    public static final int q = 1;
    public static final int r = 2;
    public b a;
    public d b;
    public String c;
    public String d;
    public e e;
    public String f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;

    /* renamed from: o  reason: collision with root package name */
    public a f778o;
    public c p;

    /* renamed from: o.jv1$a */
    /* loaded from: classes.dex */
    public enum a {
        OVERSHOOT,
        BOUNCE_START,
        BOUNCE_END,
        BOUNCE_BOTH
    }

    /* renamed from: o.jv1$b */
    /* loaded from: classes.dex */
    public enum b {
        UP,
        DOWN,
        LEFT,
        RIGHT,
        START,
        END,
        CLOCKWISE,
        ANTICLOCKWISE
    }

    /* renamed from: o.jv1$c */
    /* loaded from: classes.dex */
    public enum c {
        VELOCITY,
        SPRING
    }

    /* renamed from: o.jv1$d */
    /* loaded from: classes.dex */
    public enum d {
        TOP,
        LEFT,
        RIGHT,
        BOTTOM,
        MIDDLE,
        START,
        END
    }

    /* renamed from: o.jv1$e */
    /* loaded from: classes.dex */
    public enum e {
        AUTOCOMPLETE,
        TO_START,
        NEVER_COMPLETE_END,
        TO_END,
        STOP,
        DECELERATE,
        DECELERATE_COMPLETE,
        NEVER_COMPLETE_START
    }

    public C7396jv1() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.f778o = null;
        this.p = null;
    }

    public C7396jv1 A(float f) {
        this.k = f;
        return this;
    }

    public C7396jv1 B(float f) {
        this.l = f;
        return this;
    }

    public C7396jv1 C(float f) {
        this.m = f;
        return this;
    }

    public C7396jv1 D(float f) {
        this.n = f;
        return this;
    }

    public C7396jv1 E(String str) {
        this.c = str;
        return this;
    }

    public C7396jv1 F(d dVar) {
        this.b = dVar;
        return this;
    }

    public c a() {
        return this.p;
    }

    public b b() {
        return this.a;
    }

    public float c() {
        return this.i;
    }

    public float d() {
        return this.j;
    }

    public String e() {
        return this.d;
    }

    public float f() {
        return this.h;
    }

    public float g() {
        return this.g;
    }

    public e h() {
        return this.e;
    }

    public String i() {
        return this.f;
    }

    public a j() {
        return this.f778o;
    }

    public float k() {
        return this.k;
    }

    public float l() {
        return this.l;
    }

    public float m() {
        return this.m;
    }

    public float n() {
        return this.n;
    }

    public String o() {
        return this.c;
    }

    public d p() {
        return this.b;
    }

    public void q(c cVar) {
        this.p = cVar;
    }

    public C7396jv1 r(b bVar) {
        this.a = bVar;
        return this;
    }

    public C7396jv1 s(int i) {
        this.i = i;
        return this;
    }

    public C7396jv1 t(int i) {
        this.j = i;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OnSwipe:{\n");
        if (this.c != null) {
            sb.append("anchor:'");
            sb.append(this.c);
            sb.append("',\n");
        }
        if (this.a != null) {
            sb.append("direction:'");
            sb.append(this.a.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.b != null) {
            sb.append("side:'");
            sb.append(this.b.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!Float.isNaN(this.i)) {
            sb.append("scale:'");
            sb.append(this.i);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.j)) {
            sb.append("threshold:'");
            sb.append(this.j);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.g)) {
            sb.append("maxVelocity:'");
            sb.append(this.g);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.h)) {
            sb.append("maxAccel:'");
            sb.append(this.h);
            sb.append("',\n");
        }
        if (this.d != null) {
            sb.append("limitBounds:'");
            sb.append(this.d);
            sb.append("',\n");
        }
        if (this.p != null) {
            sb.append("mode:'");
            sb.append(this.p.toString().toLowerCase());
            sb.append("',\n");
        }
        if (this.e != null) {
            sb.append("touchUp:'");
            sb.append(this.e.toString().toLowerCase());
            sb.append("',\n");
        }
        if (!Float.isNaN(this.l)) {
            sb.append("springMass:'");
            sb.append(this.l);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.m)) {
            sb.append("springStiffness:'");
            sb.append(this.m);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.k)) {
            sb.append("springDamping:'");
            sb.append(this.k);
            sb.append("',\n");
        }
        if (!Float.isNaN(this.n)) {
            sb.append("stopThreshold:'");
            sb.append(this.n);
            sb.append("',\n");
        }
        if (this.f778o != null) {
            sb.append("springBoundary:'");
            sb.append(this.f778o);
            sb.append("',\n");
        }
        if (this.f != null) {
            sb.append("around:'");
            sb.append(this.f);
            sb.append("',\n");
        }
        sb.append("},\n");
        return sb.toString();
    }

    public C7396jv1 u(String str) {
        this.d = str;
        return this;
    }

    public C7396jv1 v(int i) {
        this.h = i;
        return this;
    }

    public C7396jv1 w(int i) {
        this.g = i;
        return this;
    }

    public C7396jv1 x(e eVar) {
        this.e = eVar;
        return this;
    }

    public C7396jv1 y(String str) {
        this.f = str;
        return this;
    }

    public C7396jv1 z(a aVar) {
        this.f778o = aVar;
        return this;
    }

    public C7396jv1(String str, d dVar, b bVar) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.f778o = null;
        this.p = null;
        this.c = str;
        this.b = dVar;
        this.a = bVar;
    }
}
