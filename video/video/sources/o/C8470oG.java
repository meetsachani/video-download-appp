package o;

import android.content.Context;
import android.util.Pair;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: o.oG  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8470oG {
    public static final short a = 2;
    public static final short b = 1;
    public static final short c = 512;
    public static final short d = 513;
    public static final short e = 514;
    public static final byte f = 1;
    public static final byte g = Byte.MAX_VALUE;
    public static final String h = "color";
    public static byte i;
    public static final d j = new d(1, "android");
    public static final Comparator<b> k = new a();

    /* renamed from: o.oG$a */
    /* loaded from: classes3.dex */
    public class a implements Comparator<b> {
        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(b bVar, b bVar2) {
            return bVar.c - bVar2.c;
        }
    }

    /* renamed from: o.oG$b */
    /* loaded from: classes3.dex */
    public static class b {
        public final byte a;
        public final byte b;
        public final short c;
        public final String d;
        @JF
        public final int e;

        public b(int i, String str, int i2) {
            this.d = str;
            this.e = i2;
            this.c = (short) (65535 & i);
            this.b = (byte) ((i >> 16) & 255);
            this.a = (byte) ((i >> 24) & 255);
        }
    }

    /* renamed from: o.oG$c */
    /* loaded from: classes3.dex */
    public static class c {
        public static final short f = 288;
        public static final int g = 128;
        public final e a = new e(C8470oG.c, f, c());
        public final d b;
        public final h c;
        public final h d;
        public final k e;

        public c(d dVar, List<b> list) {
            this.b = dVar;
            this.c = new h(false, b(list));
            this.d = new h(true, a(list));
            this.e = new k(list);
        }

        public final String[] a(List<b> list) {
            String[] strArr = new String[list.size()];
            for (int i = 0; i < list.size(); i++) {
                strArr[i] = list.get(i).d;
            }
            return strArr;
        }

        public final String[] b(List<b> list) {
            int i = 0;
            if (!list.isEmpty()) {
                int i2 = list.get(0).b;
                String[] strArr = new String[i2];
                while (true) {
                    int i3 = i2 - 1;
                    if (i < i3) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("?");
                        int i4 = i + 1;
                        sb.append(i4);
                        strArr[i] = sb.toString();
                        i = i4;
                    } else {
                        strArr[i3] = "color";
                        return strArr;
                    }
                }
            } else {
                return new String[0];
            }
        }

        public int c() {
            return this.c.a() + 288 + this.d.a() + this.e.b();
        }

        public void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(C8470oG.l(this.b.a));
            char[] charArray = this.b.b.toCharArray();
            for (int i = 0; i < 128; i++) {
                if (i < charArray.length) {
                    byteArrayOutputStream.write(C8470oG.h(charArray[i]));
                } else {
                    byteArrayOutputStream.write(C8470oG.h((char) 0));
                }
            }
            byteArrayOutputStream.write(C8470oG.l(288));
            byteArrayOutputStream.write(C8470oG.l(0));
            byteArrayOutputStream.write(C8470oG.l(this.c.a() + 288));
            byteArrayOutputStream.write(C8470oG.l(0));
            byteArrayOutputStream.write(C8470oG.l(0));
            this.c.c(byteArrayOutputStream);
            this.d.c(byteArrayOutputStream);
            this.e.c(byteArrayOutputStream);
        }
    }

    /* renamed from: o.oG$d */
    /* loaded from: classes3.dex */
    public static class d {
        public final int a;
        public final String b;

        public d(int i, String str) {
            this.a = i;
            this.b = str;
        }
    }

    /* renamed from: o.oG$e */
    /* loaded from: classes3.dex */
    public static class e {
        public final short a;
        public final short b;
        public final int c;

        public e(short s, short s2, int i) {
            this.a = s;
            this.b = s2;
            this.c = i;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C8470oG.m(this.a));
            byteArrayOutputStream.write(C8470oG.m(this.b));
            byteArrayOutputStream.write(C8470oG.l(this.c));
        }
    }

    /* renamed from: o.oG$f */
    /* loaded from: classes3.dex */
    public static class f {
        public static final short c = 8;
        public static final short d = 2;
        public static final short e = 8;
        public static final byte f = 28;
        public static final int g = 16;
        public final int a;
        public final int b;

        public f(int i, @JF int i2) {
            this.a = i;
            this.b = i2;
        }

        public void a(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C8470oG.m((short) 8));
            byteArrayOutputStream.write(C8470oG.m((short) 2));
            byteArrayOutputStream.write(C8470oG.l(this.a));
            byteArrayOutputStream.write(C8470oG.m((short) 8));
            byteArrayOutputStream.write(new byte[]{0, 28});
            byteArrayOutputStream.write(C8470oG.l(this.b));
        }
    }

    /* renamed from: o.oG$g */
    /* loaded from: classes3.dex */
    public static class g {
        public static final short e = 12;
        public final e a;
        public final int b;
        public final List<c> d = new ArrayList();
        public final h c = new h(new String[0]);

        public g(Map<d, List<b>> map) {
            this.b = map.size();
            for (Map.Entry<d, List<b>> entry : map.entrySet()) {
                List<b> value = entry.getValue();
                Collections.sort(value, C8470oG.k);
                this.d.add(new c(entry.getKey(), value));
            }
            this.a = new e((short) 2, (short) 12, a());
        }

        public final int a() {
            int i = 0;
            for (c cVar : this.d) {
                i += cVar.c();
            }
            return this.c.a() + 12 + i;
        }

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(C8470oG.l(this.b));
            this.c.c(byteArrayOutputStream);
            for (c cVar : this.d) {
                cVar.d(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: o.oG$h */
    /* loaded from: classes3.dex */
    public static class h {
        public static final short m = 28;
        public static final int n = 256;

        /* renamed from: o  reason: collision with root package name */
        public static final int f825o = -1;
        public final e a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final List<Integer> f;
        public final List<Integer> g;
        public final List<byte[]> h;
        public final List<List<i>> i;
        public final boolean j;
        public final int k;
        public final int l;

        public h(String... strArr) {
            this(false, strArr);
        }

        public int a() {
            return this.l;
        }

        public final Pair<byte[], List<i>> b(String str) {
            return new Pair<>(this.j ? C8470oG.o(str) : C8470oG.n(str), Collections.EMPTY_LIST);
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            int i;
            this.a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(C8470oG.l(this.b));
            byteArrayOutputStream.write(C8470oG.l(this.c));
            if (this.j) {
                i = 256;
            } else {
                i = 0;
            }
            byteArrayOutputStream.write(C8470oG.l(i));
            byteArrayOutputStream.write(C8470oG.l(this.d));
            byteArrayOutputStream.write(C8470oG.l(this.e));
            for (Integer num : this.f) {
                byteArrayOutputStream.write(C8470oG.l(num.intValue()));
            }
            for (Integer num2 : this.g) {
                byteArrayOutputStream.write(C8470oG.l(num2.intValue()));
            }
            for (byte[] bArr : this.h) {
                byteArrayOutputStream.write(bArr);
            }
            int i2 = this.k;
            if (i2 > 0) {
                byteArrayOutputStream.write(new byte[i2]);
            }
            for (List<i> list : this.i) {
                for (i iVar : list) {
                    iVar.b(byteArrayOutputStream);
                }
                byteArrayOutputStream.write(C8470oG.l(-1));
            }
        }

        public h(boolean z, String... strArr) {
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = new ArrayList();
            this.i = new ArrayList();
            this.j = z;
            int i = 0;
            for (String str : strArr) {
                Pair<byte[], List<i>> b = b(str);
                this.f.add(Integer.valueOf(i));
                Object obj = b.first;
                i += ((byte[]) obj).length;
                this.h.add((byte[]) obj);
                this.i.add((List) b.second);
            }
            int i2 = 0;
            for (List<i> list : this.i) {
                for (i iVar : list) {
                    this.f.add(Integer.valueOf(i));
                    i += iVar.a.length;
                    this.h.add(iVar.a);
                }
                this.g.add(Integer.valueOf(i2));
                i2 += (list.size() * 12) + 4;
            }
            int i3 = i % 4;
            int i4 = i3 == 0 ? 0 : 4 - i3;
            this.k = i4;
            int size = this.h.size();
            this.b = size;
            this.c = this.h.size() - strArr.length;
            boolean z2 = this.h.size() - strArr.length > 0;
            if (!z2) {
                this.g.clear();
                this.i.clear();
            }
            int size2 = (size * 4) + 28 + (this.g.size() * 4);
            this.d = size2;
            int i5 = i + i4;
            this.e = z2 ? size2 + i5 : 0;
            int i6 = size2 + i5 + (z2 ? i2 : 0);
            this.l = i6;
            this.a = new e((short) 1, (short) 28, i6);
        }
    }

    /* renamed from: o.oG$i */
    /* loaded from: classes3.dex */
    public static class i {
        public byte[] a;
        public int b;
        public int c;
        public int d;

        public void b(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            byteArrayOutputStream.write(C8470oG.l(this.b));
            byteArrayOutputStream.write(C8470oG.l(this.c));
            byteArrayOutputStream.write(C8470oG.l(this.d));
        }
    }

    /* renamed from: o.oG$j */
    /* loaded from: classes3.dex */
    public static class j {
        public static final int f = -1;
        public static final short g = 84;
        public static final byte h = 64;
        public final e a;
        public final int b;
        public final byte[] c;
        public final int[] d;
        public final f[] e;

        public j(List<b> list, Set<Short> set, int i) {
            byte[] bArr = new byte[64];
            this.c = bArr;
            this.b = i;
            bArr[0] = 64;
            this.e = new f[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                this.e[i2] = new f(i2, list.get(i2).e);
            }
            this.d = new int[i];
            int i3 = 0;
            for (short s = 0; s < i; s = (short) (s + 1)) {
                if (set.contains(Short.valueOf(s))) {
                    this.d[s] = i3;
                    i3 += 16;
                } else {
                    this.d[s] = -1;
                }
            }
            this.a = new e(C8470oG.d, (short) 84, a());
        }

        public int a() {
            return b() + (this.e.length * 16);
        }

        public final int b() {
            return c() + 84;
        }

        public final int c() {
            return this.d.length * 4;
        }

        public void d(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{C8470oG.i, 0, 0, 0});
            byteArrayOutputStream.write(C8470oG.l(this.b));
            byteArrayOutputStream.write(C8470oG.l(b()));
            byteArrayOutputStream.write(this.c);
            for (int i : this.d) {
                byteArrayOutputStream.write(C8470oG.l(i));
            }
            for (f fVar : this.e) {
                fVar.a(byteArrayOutputStream);
            }
        }
    }

    /* renamed from: o.oG$k */
    /* loaded from: classes3.dex */
    public static class k {
        public static final short e = 16;
        public static final int f = 1073741824;
        public final e a;
        public final int b;
        public final int[] c;
        public final j d;

        public k(List<b> list) {
            this.b = list.get(list.size() - 1).c + 1;
            HashSet hashSet = new HashSet();
            for (b bVar : list) {
                hashSet.add(Short.valueOf(bVar.c));
            }
            this.c = new int[this.b];
            for (short s = 0; s < this.b; s = (short) (s + 1)) {
                if (hashSet.contains(Short.valueOf(s))) {
                    this.c[s] = 1073741824;
                }
            }
            this.a = new e(C8470oG.e, (short) 16, a());
            this.d = new j(list, hashSet, this.b);
        }

        public final int a() {
            return (this.b * 4) + 16;
        }

        public int b() {
            return a() + this.d.a();
        }

        public void c(ByteArrayOutputStream byteArrayOutputStream) throws IOException {
            this.a.a(byteArrayOutputStream);
            byteArrayOutputStream.write(new byte[]{C8470oG.i, 0, 0, 0});
            byteArrayOutputStream.write(C8470oG.l(this.b));
            for (int i : this.c) {
                byteArrayOutputStream.write(C8470oG.l(i));
            }
            this.d.d(byteArrayOutputStream);
        }
    }

    public static byte[] h(char c2) {
        return new byte[]{(byte) (c2 & 255), (byte) ((c2 >> '\b') & 255)};
    }

    public static byte[] i(byte[]... bArr) {
        int i2 = 0;
        for (byte[] bArr2 : bArr) {
            i2 += bArr2.length;
        }
        byte[] bArr3 = new byte[i2];
        int i3 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
            i3 += bArr4.length;
        }
        return bArr3;
    }

    public static byte[] j(Context context, Map<Integer, Integer> map) throws IOException {
        d dVar;
        if (!map.entrySet().isEmpty()) {
            d dVar2 = new d(127, context.getPackageName());
            HashMap hashMap = new HashMap();
            b bVar = null;
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                b bVar2 = new b(entry.getKey().intValue(), context.getResources().getResourceEntryName(entry.getKey().intValue()), entry.getValue().intValue());
                if (context.getResources().getResourceTypeName(entry.getKey().intValue()).equals("color")) {
                    if (bVar2.a == 1) {
                        dVar = j;
                    } else if (bVar2.a == Byte.MAX_VALUE) {
                        dVar = dVar2;
                    } else {
                        throw new IllegalArgumentException("Not supported with unknown package id: " + ((int) bVar2.a));
                    }
                    if (!hashMap.containsKey(dVar)) {
                        hashMap.put(dVar, new ArrayList());
                    }
                    ((List) hashMap.get(dVar)).add(bVar2);
                    bVar = bVar2;
                } else {
                    throw new IllegalArgumentException("Non color resource found: name=" + bVar2.d + ", typeId=" + Integer.toHexString(bVar2.b & 255));
                }
            }
            byte b2 = bVar.b;
            i = b2;
            if (b2 != 0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                new g(hashMap).b(byteArrayOutputStream);
                return byteArrayOutputStream.toByteArray();
            }
            throw new IllegalArgumentException("No color resources found for harmonization.");
        }
        throw new IllegalArgumentException("No color resources provided for harmonization.");
    }

    public static byte[] k(short s) {
        return s > 127 ? new byte[]{(byte) ((127 & (s >> 8)) | 128), (byte) (s & 255)} : new byte[]{(byte) (s & 255)};
    }

    public static byte[] l(int i2) {
        return new byte[]{(byte) (i2 & 255), (byte) ((i2 >> 8) & 255), (byte) ((i2 >> 16) & 255), (byte) ((i2 >> 24) & 255)};
    }

    public static byte[] m(short s) {
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255)};
    }

    public static byte[] n(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length * 2;
        byte[] bArr = new byte[length + 4];
        byte[] m = m((short) charArray.length);
        bArr[0] = m[0];
        bArr[1] = m[1];
        for (int i2 = 0; i2 < charArray.length; i2++) {
            byte[] h2 = h(charArray[i2]);
            int i3 = i2 * 2;
            bArr[i3 + 2] = h2[0];
            bArr[i3 + 3] = h2[1];
        }
        bArr[length + 2] = 0;
        bArr[length + 3] = 0;
        return bArr;
    }

    public static byte[] o(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        return i(k((short) str.length()), k((short) bytes.length), bytes, new byte[]{0});
    }
}
