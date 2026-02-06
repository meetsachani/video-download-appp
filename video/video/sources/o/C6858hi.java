package o;

import o.V8;

/* renamed from: o.hi  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6858hi extends V8 {
    public final Integer a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    /* renamed from: o.hi$b */
    /* loaded from: classes2.dex */
    public static final class b extends V8.a {
        public Integer a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public String j;
        public String k;
        public String l;

        @Override // o.V8.a
        public V8 a() {
            return new C6858hi(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        @Override // o.V8.a
        public V8.a b(@InterfaceC11300zs1 String str) {
            this.l = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a c(@InterfaceC11300zs1 String str) {
            this.j = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a d(@InterfaceC11300zs1 String str) {
            this.d = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a e(@InterfaceC11300zs1 String str) {
            this.h = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a f(@InterfaceC11300zs1 String str) {
            this.c = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a g(@InterfaceC11300zs1 String str) {
            this.i = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a h(@InterfaceC11300zs1 String str) {
            this.g = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a i(@InterfaceC11300zs1 String str) {
            this.k = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a j(@InterfaceC11300zs1 String str) {
            this.b = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a k(@InterfaceC11300zs1 String str) {
            this.f = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a l(@InterfaceC11300zs1 String str) {
            this.e = str;
            return this;
        }

        @Override // o.V8.a
        public V8.a m(@InterfaceC11300zs1 Integer num) {
            this.a = num;
            return this;
        }
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String b() {
        return this.l;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String c() {
        return this.j;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String d() {
        return this.d;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof V8) {
            V8 v8 = (V8) obj;
            Integer num = this.a;
            if (num != null ? num.equals(v8.m()) : v8.m() == null) {
                String str = this.b;
                if (str != null ? str.equals(v8.j()) : v8.j() == null) {
                    String str2 = this.c;
                    if (str2 != null ? str2.equals(v8.f()) : v8.f() == null) {
                        String str3 = this.d;
                        if (str3 != null ? str3.equals(v8.d()) : v8.d() == null) {
                            String str4 = this.e;
                            if (str4 != null ? str4.equals(v8.l()) : v8.l() == null) {
                                String str5 = this.f;
                                if (str5 != null ? str5.equals(v8.k()) : v8.k() == null) {
                                    String str6 = this.g;
                                    if (str6 != null ? str6.equals(v8.h()) : v8.h() == null) {
                                        String str7 = this.h;
                                        if (str7 != null ? str7.equals(v8.e()) : v8.e() == null) {
                                            String str8 = this.i;
                                            if (str8 != null ? str8.equals(v8.g()) : v8.g() == null) {
                                                String str9 = this.j;
                                                if (str9 != null ? str9.equals(v8.c()) : v8.c() == null) {
                                                    String str10 = this.k;
                                                    if (str10 != null ? str10.equals(v8.i()) : v8.i() == null) {
                                                        String str11 = this.l;
                                                        if (str11 != null ? str11.equals(v8.b()) : v8.b() == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String f() {
        return this.c;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String g() {
        return this.i;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String h() {
        return this.g;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        Integer num = this.a;
        int i = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str = this.b;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        String str4 = this.e;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i6 = (i5 ^ hashCode5) * 1000003;
        String str5 = this.f;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i7 = (i6 ^ hashCode6) * 1000003;
        String str6 = this.g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 ^ hashCode7) * 1000003;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 ^ hashCode8) * 1000003;
        String str8 = this.i;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i10 = (i9 ^ hashCode9) * 1000003;
        String str9 = this.j;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i11 = (i10 ^ hashCode10) * 1000003;
        String str10 = this.k;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i12 = (i11 ^ hashCode11) * 1000003;
        String str11 = this.l;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return i12 ^ i;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String i() {
        return this.k;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String j() {
        return this.b;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String k() {
        return this.f;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public String l() {
        return this.e;
    }

    @Override // o.V8
    @InterfaceC11300zs1
    public Integer m() {
        return this.a;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.a + ", model=" + this.b + ", hardware=" + this.c + ", device=" + this.d + ", product=" + this.e + ", osBuild=" + this.f + ", manufacturer=" + this.g + ", fingerprint=" + this.h + ", locale=" + this.i + ", country=" + this.j + ", mccMnc=" + this.k + ", applicationBuild=" + this.l + "}";
    }

    public C6858hi(@InterfaceC11300zs1 Integer num, @InterfaceC11300zs1 String str, @InterfaceC11300zs1 String str2, @InterfaceC11300zs1 String str3, @InterfaceC11300zs1 String str4, @InterfaceC11300zs1 String str5, @InterfaceC11300zs1 String str6, @InterfaceC11300zs1 String str7, @InterfaceC11300zs1 String str8, @InterfaceC11300zs1 String str9, @InterfaceC11300zs1 String str10, @InterfaceC11300zs1 String str11) {
        this.a = num;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
    }
}
