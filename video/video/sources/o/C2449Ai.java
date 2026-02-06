package o;

import o.HD;

/* renamed from: o.Ai  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2449Ai extends HD {
    public final HD.b a;
    public final V8 b;

    /* renamed from: o.Ai$b */
    /* loaded from: classes2.dex */
    public static final class b extends HD.a {
        public HD.b a;
        public V8 b;

        @Override // o.HD.a
        public HD a() {
            return new C2449Ai(this.a, this.b);
        }

        @Override // o.HD.a
        public HD.a b(@InterfaceC11300zs1 V8 v8) {
            this.b = v8;
            return this;
        }

        @Override // o.HD.a
        public HD.a c(@InterfaceC11300zs1 HD.b bVar) {
            this.a = bVar;
            return this;
        }
    }

    @Override // o.HD
    @InterfaceC11300zs1
    public V8 b() {
        return this.b;
    }

    @Override // o.HD
    @InterfaceC11300zs1
    public HD.b c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HD) {
            HD hd = (HD) obj;
            HD.b bVar = this.a;
            if (bVar != null ? bVar.equals(hd.c()) : hd.c() == null) {
                V8 v8 = this.b;
                if (v8 != null ? v8.equals(hd.b()) : hd.b() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        HD.b bVar = this.a;
        int i = 0;
        if (bVar == null) {
            hashCode = 0;
        } else {
            hashCode = bVar.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        V8 v8 = this.b;
        if (v8 != null) {
            i = v8.hashCode();
        }
        return i2 ^ i;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.a + ", androidClientInfo=" + this.b + "}";
    }

    public C2449Ai(@InterfaceC11300zs1 HD.b bVar, @InterfaceC11300zs1 V8 v8) {
        this.a = bVar;
        this.b = v8;
    }
}
