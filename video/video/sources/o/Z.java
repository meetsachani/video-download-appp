package o;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import o.TD0;

/* loaded from: classes4.dex */
public abstract class Z<K, V> extends AbstractMap<K, V> implements InterfaceC10091uu2<K, V>, Serializable {
    private static final long serialVersionUID = 5826987063535505652L;
    public final AbstractC7061iX0<? super K> X;

    public Z(AbstractC7061iX0<? super K> abstractC7061iX0) {
        if (abstractC7061iX0 != null) {
            this.X = abstractC7061iX0;
            return;
        }
        throw new NullPointerException("keyAnalyzer");
    }

    public static boolean d(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    public final int a(K k, K k2) {
        return this.X.a(k, 0, i(k), k2, 0, i(k2));
    }

    public final int b() {
        return this.X.b();
    }

    public final boolean e(K k, K k2) {
        if (k == null) {
            if (k2 == null) {
                return true;
            }
            return false;
        } else if (k2 != null && this.X.compare(k, k2) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public AbstractC7061iX0<? super K> f() {
        return this.X;
    }

    public final boolean g(K k, int i, int i2) {
        if (k == null) {
            return false;
        }
        return this.X.c(k, i, i2);
    }

    public final int i(K k) {
        if (k == null) {
            return 0;
        }
        return this.X.i(k);
    }

    @Override // java.util.AbstractMap
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Trie[");
        sb.append(size());
        sb.append("]={\n");
        for (Map.Entry<K, V> entry : entrySet()) {
            sb.append(TD0.a.Y0);
            sb.append(entry);
            sb.append("\n");
        }
        sb.append("}\n");
        return sb.toString();
    }

    /* loaded from: classes4.dex */
    public static abstract class a<K, V> implements Map.Entry<K, V>, Serializable {
        private static final long serialVersionUID = -944364551314110330L;
        public K X;
        public V Y;

        public a(K k) {
            this.X = k;
        }

        public V a(K k, V v) {
            this.X = k;
            return setValue(v);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (Z.d(this.X, entry.getKey()) && Z.d(this.Y, entry.getValue())) {
                return true;
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.X;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.Y;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            int i = 0;
            if (getKey() == null) {
                hashCode = 0;
            } else {
                hashCode = getKey().hashCode();
            }
            if (getValue() != null) {
                i = getValue().hashCode();
            }
            return hashCode ^ i;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.Y;
            this.Y = v;
            return v2;
        }

        public String toString() {
            return this.X + "=" + this.Y;
        }

        public a(K k, V v) {
            this.X = k;
            this.Y = v;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final K c(Object obj) {
        return obj;
    }
}
