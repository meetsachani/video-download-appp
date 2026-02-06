package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import o.C3307Iz;
import o.C8077mf;

/* JADX INFO: Add missing generic type declarations: [E] */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010*\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0092\u0004\u0018\u00002\f0\u0001R\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0005H\u0016J\r\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u0005H\u0016¨\u0006\u000e"}, d2 = {"Lkotlin/collections/AbstractList$ListIteratorImpl;", "Lkotlin/collections/AbstractList$IteratorImpl;", "Lkotlin/collections/AbstractList;", "", "index", "", "<init>", "(Lkotlin/collections/AbstractList;I)V", "hasPrevious", "", "nextIndex", "previous", "()Ljava/lang/Object;", "previousIndex", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.facebook.ads.redexgen.X.1s  reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C04001s<E> extends AbstractC03991r<E>.IteratorImpl implements ListIterator<E> {
    public static byte[] A01;
    public final /* synthetic */ AbstractC03991r<E> A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 88);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{C8077mf.u, C3307Iz.e0, 56, 47, 60, C3307Iz.a0, 52, 50, 51, 125, 52, C3307Iz.f0, 125, 51, 50, C3307Iz.a0, 125, C3307Iz.f0, 40, C3307Iz.e0, C3307Iz.e0, 50, 47, C3307Iz.a0, 56, 57, 125, 59, 50, 47, 125, 47, 56, 60, 57, 112, 50, 51, 49, 36, 125, 62, 50, 49, 49, 56, 62, C3307Iz.a0, 52, 50, 51};
    }

    @Override // java.util.ListIterator
    public final void add(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    @Override // java.util.ListIterator
    public final void set(E e) {
        throw new UnsupportedOperationException(A00(0, 51, 5));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04001s(AbstractC03991r abstractC03991r, int i) {
        super(abstractC03991r);
        this.A00 = abstractC03991r;
        AbstractC03991r.A02.A04(i, this.A00.size());
        A05(i);
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return A04() > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return A04();
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (hasPrevious()) {
            AbstractC03991r<E> abstractC03991r = this.A00;
            A05(A04() - 1);
            return abstractC03991r.get(A04());
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return A04() - 1;
    }
}
