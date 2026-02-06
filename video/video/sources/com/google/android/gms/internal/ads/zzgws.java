package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgws;
import com.google.android.gms.internal.ads.zzgwt;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public abstract class zzgws<MessageType extends zzgwt<MessageType, BuilderType>, BuilderType extends zzgws<MessageType, BuilderType>> implements zzhac {
    public static zzhbh A1(zzhad zzhadVar) {
        return new zzhbh(zzhadVar);
    }

    @Deprecated
    public static <T> void B1(Iterable<T> iterable, Collection<? super T> collection) {
        C1(iterable, (List) collection);
    }

    public static <T> void C1(Iterable<T> iterable, List<? super T> list) {
        byte[] bArr = zzgzf.b;
        iterable.getClass();
        if (iterable instanceof zzgzp) {
            List a = ((zzgzp) iterable).a();
            zzgzp zzgzpVar = (zzgzp) list;
            int size = list.size();
            for (Object obj : a) {
                if (obj == null) {
                    String str = "Element at index " + (zzgzpVar.size() - size) + " is null.";
                    int size2 = zzgzpVar.size();
                    while (true) {
                        size2--;
                        if (size2 < size) {
                            break;
                        }
                        zzgzpVar.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (obj instanceof zzgxk) {
                    zzgxk zzgxkVar = (zzgxk) obj;
                    zzgzpVar.b();
                } else if (obj instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj;
                    zzgxk.U(bArr2, 0, bArr2.length);
                    zzgzpVar.b();
                } else {
                    zzgzpVar.add((String) obj);
                }
            }
        } else if (iterable instanceof zzham) {
            list.addAll((Collection) iterable);
        } else {
            y1(iterable, list);
        }
    }

    public static void F1(List<?> list, int i) {
        String str = "Element at index " + (list.size() - i) + " is null.";
        int size = list.size();
        while (true) {
            size--;
            if (size >= i) {
                list.remove(size);
            } else {
                throw new NullPointerException(str);
            }
        }
    }

    public static <T> void y1(Iterable<T> iterable, List<? super T> list) {
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size();
            if (list instanceof ArrayList) {
                ((ArrayList) list).ensureCapacity(list.size() + size);
            } else if (list instanceof zzhao) {
                ((zzhao) list).f(list.size() + size);
            }
        }
        int size2 = list.size();
        if ((iterable instanceof List) && (iterable instanceof RandomAccess)) {
            List list2 = (List) iterable;
            int size3 = list2.size();
            for (int i = 0; i < size3; i++) {
                Object obj = (Object) list2.get(i);
                if (obj == 0) {
                    F1(list, size2);
                }
                list.add(obj);
            }
            return;
        }
        for (Object obj2 : iterable) {
            if (obj2 == null) {
                F1(list, size2);
            }
            list.add(obj2);
        }
    }

    public boolean D1(InputStream inputStream) throws IOException {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        return E1(inputStream, zzgyc.d);
    }

    public boolean E1(InputStream inputStream, zzgyc zzgycVar) throws IOException {
        int read = inputStream.read();
        if (read == -1) {
            return false;
        }
        i1(new zzgwr(inputStream, zzgxq.d(read, inputStream)), zzgycVar);
        return true;
    }

    public final String X0(String str) {
        String name = getClass().getName();
        return "Reading " + name + " from a " + str + " threw an IOException (should never happen).";
    }

    @Override // 
    /* renamed from: Y0 */
    public abstract BuilderType m1();

    public abstract BuilderType a1(MessageType messagetype);

    public BuilderType b1(zzgxk zzgxkVar) throws zzgzh {
        try {
            zzgxq B = zzgxkVar.B();
            o1(B);
            B.A(0);
            return this;
        } catch (zzgzh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(X0("ByteString"), e2);
        }
    }

    /* renamed from: c1 */
    public BuilderType o1(zzgxq zzgxqVar) throws IOException {
        int i = zzgyc.e;
        int i2 = zzhan.d;
        return t1(zzgxqVar, zzgyc.d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: d1 */
    public BuilderType p1(zzhad zzhadVar) {
        if (R0().getClass().isInstance(zzhadVar)) {
            return (BuilderType) a1((zzgwt) zzhadVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    public BuilderType e1(InputStream inputStream) throws IOException {
        zzgxq f = zzgxq.f(inputStream, 4096);
        o1(f);
        f.A(0);
        return this;
    }

    /* renamed from: f1 */
    public BuilderType r1(byte[] bArr) throws zzgzh {
        return w1(bArr, 0, bArr.length);
    }

    public BuilderType g1(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        try {
            zzgxq B = zzgxkVar.B();
            t1(B, zzgycVar);
            B.A(0);
            return this;
        } catch (zzgzh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(X0("ByteString"), e2);
        }
    }

    @Override // 
    /* renamed from: h1 */
    public abstract BuilderType t1(zzgxq zzgxqVar, zzgyc zzgycVar) throws IOException;

    public BuilderType i1(InputStream inputStream, zzgyc zzgycVar) throws IOException {
        zzgxq f = zzgxq.f(inputStream, 4096);
        t1(f, zzgycVar);
        f.A(0);
        return this;
    }

    /* renamed from: j1 */
    public BuilderType v1(byte[] bArr, zzgyc zzgycVar) throws zzgzh {
        return z1(bArr, 0, bArr.length, zzgycVar);
    }

    @Override // 
    /* renamed from: k1 */
    public BuilderType w1(byte[] bArr, int i, int i2) throws zzgzh {
        try {
            zzgxq g = zzgxq.g(bArr, i, i2, false);
            o1(g);
            g.A(0);
            return this;
        } catch (zzgzh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(X0("byte array"), e2);
        }
    }

    @Override // 
    /* renamed from: l1 */
    public BuilderType z1(byte[] bArr, int i, int i2, zzgyc zzgycVar) throws zzgzh {
        try {
            zzgxq g = zzgxq.g(bArr, i, i2, false);
            t1(g, zzgycVar);
            g.A(0);
            return this;
        } catch (zzgzh e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException(X0("byte array"), e2);
        }
    }

    public /* bridge */ /* synthetic */ zzhac n1(zzgxk zzgxkVar) throws zzgzh {
        b1(zzgxkVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhac q1(InputStream inputStream) throws IOException {
        e1(inputStream);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhac s1(zzgxk zzgxkVar, zzgyc zzgycVar) throws zzgzh {
        g1(zzgxkVar, zzgycVar);
        return this;
    }

    public /* bridge */ /* synthetic */ zzhac u1(InputStream inputStream, zzgyc zzgycVar) throws IOException {
        i1(inputStream, zzgycVar);
        return this;
    }
}
