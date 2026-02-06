package o;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MV0 extends DV0 {
    public final Object X;

    public MV0(Boolean bool) {
        Objects.requireNonNull(bool);
        this.X = bool;
    }

    public static boolean X(MV0 mv0) {
        Object obj = mv0.X;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        if (!(number instanceof BigInteger) && !(number instanceof Long) && !(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            return false;
        }
        return true;
    }

    @Override // o.DV0
    public long F() {
        if (Y()) {
            return G().longValue();
        }
        return Long.parseLong(J());
    }

    @Override // o.DV0
    public Number G() {
        Object obj = this.X;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new DY0((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    @Override // o.DV0
    public short H() {
        if (Y()) {
            return G().shortValue();
        }
        return Short.parseShort(J());
    }

    @Override // o.DV0
    public String J() {
        Object obj = this.X;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (Y()) {
            return G().toString();
        }
        if (V()) {
            return ((Boolean) this.X).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.X.getClass());
    }

    public boolean V() {
        return this.X instanceof Boolean;
    }

    public boolean Y() {
        return this.X instanceof Number;
    }

    public boolean a0() {
        return this.X instanceof String;
    }

    @Override // o.DV0
    public BigDecimal e() {
        Object obj = this.X;
        if (obj instanceof BigDecimal) {
            return (BigDecimal) obj;
        }
        return C3286Is1.b(J());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MV0.class != obj.getClass()) {
            return false;
        }
        MV0 mv0 = (MV0) obj;
        if (this.X == null) {
            if (mv0.X == null) {
                return true;
            }
            return false;
        } else if (X(this) && X(mv0)) {
            if (!(this.X instanceof BigInteger) && !(mv0.X instanceof BigInteger)) {
                if (G().longValue() == mv0.G().longValue()) {
                    return true;
                }
                return false;
            }
            return f().equals(mv0.f());
        } else {
            Object obj2 = this.X;
            if (obj2 instanceof Number) {
                Object obj3 = mv0.X;
                if (obj3 instanceof Number) {
                    if ((obj2 instanceof BigDecimal) && (obj3 instanceof BigDecimal)) {
                        if (e().compareTo(mv0.e()) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double k = k();
                    double k2 = mv0.k();
                    if (k == k2 || (Double.isNaN(k) && Double.isNaN(k2))) {
                        return true;
                    }
                    return false;
                }
            }
            return obj2.equals(mv0.X);
        }
    }

    @Override // o.DV0
    public BigInteger f() {
        Object obj = this.X;
        if (obj instanceof BigInteger) {
            return (BigInteger) obj;
        }
        if (X(this)) {
            return BigInteger.valueOf(G().longValue());
        }
        return C3286Is1.c(J());
    }

    @Override // o.DV0
    public boolean h() {
        if (V()) {
            return ((Boolean) this.X).booleanValue();
        }
        return Boolean.parseBoolean(J());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.X == null) {
            return 31;
        }
        if (X(this)) {
            doubleToLongBits = G().longValue();
        } else {
            Object obj = this.X;
            if (obj instanceof Number) {
                doubleToLongBits = Double.doubleToLongBits(G().doubleValue());
            } else {
                return obj.hashCode();
            }
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    @Override // o.DV0
    public byte i() {
        if (Y()) {
            return G().byteValue();
        }
        return Byte.parseByte(J());
    }

    @Override // o.DV0
    @Deprecated
    public char j() {
        String J = J();
        if (!J.isEmpty()) {
            return J.charAt(0);
        }
        throw new UnsupportedOperationException("String value is empty");
    }

    @Override // o.DV0
    public double k() {
        if (Y()) {
            return G().doubleValue();
        }
        return Double.parseDouble(J());
    }

    @Override // o.DV0
    public float l() {
        if (Y()) {
            return G().floatValue();
        }
        return Float.parseFloat(J());
    }

    @Override // o.DV0
    public int p() {
        if (Y()) {
            return G().intValue();
        }
        return Integer.parseInt(J());
    }

    public MV0(Number number) {
        Objects.requireNonNull(number);
        this.X = number;
    }

    public MV0(String str) {
        Objects.requireNonNull(str);
        this.X = str;
    }

    public MV0(Character ch) {
        Objects.requireNonNull(ch);
        this.X = ch.toString();
    }

    @Override // o.DV0
    /* renamed from: U */
    public MV0 d() {
        return this;
    }
}
