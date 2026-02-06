package o;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Deprecated
/* renamed from: o.tY  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9759tY implements InterfaceC6278fM {
    public static final C9759tY f = new C9759tY(Collections.EMPTY_MAP);
    public int d;
    public final Map<String, byte[]> e;

    public C9759tY() {
        this(Collections.EMPTY_MAP);
    }

    public static void a(HashMap<String, byte[]> hashMap, Map<String, Object> map) {
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            hashMap.put(entry.getKey(), j(entry.getValue()));
        }
    }

    public static Map<String, byte[]> b(Map<String, byte[]> map, C6533gM c6533gM) {
        HashMap hashMap = new HashMap(map);
        l(hashMap, c6533gM.c());
        a(hashMap, c6533gM.b());
        return hashMap;
    }

    public static byte[] j(Object obj) {
        if (obj instanceof Long) {
            return ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes(KB.c);
        }
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        throw new IllegalArgumentException();
    }

    public static boolean k(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public static void l(HashMap<String, byte[]> hashMap, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            hashMap.remove(list.get(i));
        }
    }

    @Override // o.InterfaceC6278fM
    @InterfaceC11300zs1
    public final String c(String str, @InterfaceC11300zs1 String str2) {
        byte[] bArr = this.e.get(str);
        if (bArr != null) {
            return new String(bArr, KB.c);
        }
        return str2;
    }

    @Override // o.InterfaceC6278fM
    public final boolean contains(String str) {
        return this.e.containsKey(str);
    }

    @Override // o.InterfaceC6278fM
    public final long e(String str, long j) {
        byte[] bArr = this.e.get(str);
        if (bArr != null) {
            return ByteBuffer.wrap(bArr).getLong();
        }
        return j;
    }

    public boolean equals(@InterfaceC11300zs1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9759tY.class == obj.getClass()) {
            return k(this.e, ((C9759tY) obj).e);
        }
        return false;
    }

    @Override // o.InterfaceC6278fM
    @InterfaceC11300zs1
    public final byte[] f(String str, @InterfaceC11300zs1 byte[] bArr) {
        byte[] bArr2 = this.e.get(str);
        if (bArr2 != null) {
            return Arrays.copyOf(bArr2, bArr2.length);
        }
        return bArr;
    }

    public C9759tY h(C6533gM c6533gM) {
        Map<String, byte[]> b = b(this.e, c6533gM);
        if (k(this.e, b)) {
            return this;
        }
        return new C9759tY(b);
    }

    public int hashCode() {
        if (this.d == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.e.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.d = i;
        }
        return this.d;
    }

    public Set<Map.Entry<String, byte[]>> i() {
        return this.e.entrySet();
    }

    public C9759tY(Map<String, byte[]> map) {
        this.e = Collections.unmodifiableMap(map);
    }
}
