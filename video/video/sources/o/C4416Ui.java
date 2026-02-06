package o;

import java.util.Arrays;
import o.M31;

/* renamed from: o.Ui  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4416Ui extends M31 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final AbstractC2675Cp1 g;

    /* renamed from: o.Ui$b */
    /* loaded from: classes2.dex */
    public static final class b extends M31.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public AbstractC2675Cp1 g;

        @Override // o.M31.a
        public M31 a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C4416Ui(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // o.M31.a
        public M31.a b(@InterfaceC11300zs1 Integer num) {
            this.b = num;
            return this;
        }

        @Override // o.M31.a
        public M31.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // o.M31.a
        public M31.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // o.M31.a
        public M31.a e(@InterfaceC11300zs1 AbstractC2675Cp1 abstractC2675Cp1) {
            this.g = abstractC2675Cp1;
            return this;
        }

        @Override // o.M31.a
        public M31.a f(@InterfaceC11300zs1 byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // o.M31.a
        public M31.a g(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @Override // o.M31.a
        public M31.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // o.M31
    @InterfaceC11300zs1
    public Integer b() {
        return this.b;
    }

    @Override // o.M31
    public long c() {
        return this.a;
    }

    @Override // o.M31
    public long d() {
        return this.c;
    }

    @Override // o.M31
    @InterfaceC11300zs1
    public AbstractC2675Cp1 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        byte[] f;
        String str;
        AbstractC2675Cp1 abstractC2675Cp1;
        if (obj == this) {
            return true;
        }
        if (obj instanceof M31) {
            M31 m31 = (M31) obj;
            if (this.a == m31.c() && ((num = this.b) != null ? num.equals(m31.b()) : m31.b() == null) && this.c == m31.d()) {
                byte[] bArr = this.d;
                if (m31 instanceof C4416Ui) {
                    f = ((C4416Ui) m31).d;
                } else {
                    f = m31.f();
                }
                if (Arrays.equals(bArr, f) && ((str = this.e) != null ? str.equals(m31.g()) : m31.g() == null) && this.f == m31.h() && ((abstractC2675Cp1 = this.g) != null ? abstractC2675Cp1.equals(m31.e()) : m31.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // o.M31
    @InterfaceC11300zs1
    public byte[] f() {
        return this.d;
    }

    @Override // o.M31
    @InterfaceC11300zs1
    public String g() {
        return this.e;
    }

    @Override // o.M31
    public long h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int i2 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        long j2 = this.c;
        int hashCode3 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        long j3 = this.f;
        int i3 = (((hashCode3 ^ hashCode2) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC2675Cp1 abstractC2675Cp1 = this.g;
        if (abstractC2675Cp1 != null) {
            i2 = abstractC2675Cp1.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }

    public C4416Ui(long j, @InterfaceC11300zs1 Integer num, long j2, @InterfaceC11300zs1 byte[] bArr, @InterfaceC11300zs1 String str, long j3, @InterfaceC11300zs1 AbstractC2675Cp1 abstractC2675Cp1) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = abstractC2675Cp1;
    }
}
