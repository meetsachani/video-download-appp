package o;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* loaded from: classes3.dex */
public final class DY0 extends Number {
    public final String X;

    public DY0(String str) {
        this.X = str;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return a();
    }

    public final BigDecimal a() {
        return C3286Is1.b(this.X);
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.X);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DY0) {
            return this.X.equals(((DY0) obj).X);
        }
        return false;
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.X);
    }

    public int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.X);
            } catch (NumberFormatException unused) {
                return a().intValue();
            }
        } catch (NumberFormatException unused2) {
            return (int) Long.parseLong(this.X);
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.X);
        } catch (NumberFormatException unused) {
            return a().longValue();
        }
    }

    public String toString() {
        return this.X;
    }
}
