package o;

import java.util.Objects;

/* renamed from: o.xZ0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C10738xZ0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;

    public C10738xZ0(Integer num, Integer num2, Integer num3, Integer num4) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
    }

    public Integer a() {
        return this.c;
    }

    public Integer b() {
        return this.a;
    }

    public Integer c() {
        return this.b;
    }

    public Integer d() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C10738xZ0 c10738xZ0 = (C10738xZ0) obj;
            if (Objects.equals(this.a, c10738xZ0.a) && Objects.equals(this.b, c10738xZ0.b) && Objects.equals(this.c, c10738xZ0.c) && Objects.equals(this.d, c10738xZ0.d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d);
    }

    public String toString() {
        return "Distance: " + this.a + ", Insert: " + this.b + ", Delete: " + this.c + ", Substitute: " + this.d;
    }
}
