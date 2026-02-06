package com.facebook.ads.redexgen.X;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1A  reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C1A<K, V> extends C2L<K, V> implements BM<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.C2L
    public final Collection<V> A0F(@ParametricNullness K key, Collection<V> collection) {
        return A0H(key, (List) collection, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    public C1A(Map<K, Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.C2L
    public final <E> Collection<E> A0G(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC0640Bq, com.facebook.ads.redexgen.X.InterfaceC2227q3
    public Map<K, Collection<V>> A4H() {
        return super.A4H();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.C2L, com.facebook.ads.redexgen.X.InterfaceC2227q3
    public boolean AHE(@ParametricNullness K key, @ParametricNullness V value) {
        return super.AHE(key, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.X.AbstractC0640Bq
    public boolean equals(@CheckForNull Object object) {
        return super.equals(object);
    }
}
