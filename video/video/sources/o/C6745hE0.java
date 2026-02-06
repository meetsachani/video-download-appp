package o;

import java.util.Date;
import java.util.TimeZone;

/* renamed from: o.hE0  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6745hE0 extends TimeZone {
    public static final int Y0 = 60;
    public static final int Z = 60000;
    public static final int Z0 = 24;
    static final long serialVersionUID = 1;
    public final int X;
    public final String Y;

    public C6745hE0(boolean z, int i, int i2) {
        char c;
        if (i < 24) {
            if (i2 < 60) {
                int i3 = ((i * 60) + i2) * 60000;
                this.X = z ? -i3 : i3;
                StringBuilder sb = new StringBuilder(9);
                sb.append(C5663cp2.a);
                if (z) {
                    c = '-';
                } else {
                    c = '+';
                }
                sb.append(c);
                StringBuilder b = b(sb, i);
                b.append(':');
                this.Y = b(b, i2).toString();
                return;
            }
            throw new IllegalArgumentException(i2 + " minutes out of range");
        }
        throw new IllegalArgumentException(i + " hours out of range");
    }

    public static StringBuilder b(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
        return sb;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6745hE0) || this.Y != ((C6745hE0) obj).Y) {
            return false;
        }
        return true;
    }

    @Override // java.util.TimeZone
    public String getID() {
        return this.Y;
    }

    @Override // java.util.TimeZone
    public int getOffset(int i, int i2, int i3, int i4, int i5, int i6) {
        return this.X;
    }

    @Override // java.util.TimeZone
    public int getRawOffset() {
        return this.X;
    }

    public int hashCode() {
        return this.X;
    }

    @Override // java.util.TimeZone
    public boolean inDaylightTime(Date date) {
        return false;
    }

    @Override // java.util.TimeZone
    public void setRawOffset(int i) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return "[GmtTimeZone id=\"" + this.Y + "\",offset=" + this.X + ']';
    }

    @Override // java.util.TimeZone
    public boolean useDaylightTime() {
        return false;
    }
}
