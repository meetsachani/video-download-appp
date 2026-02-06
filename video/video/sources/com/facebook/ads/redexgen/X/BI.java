package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class BI<K, V> extends AbstractC2261qf<Map.Entry<K, V>> {
    public abstract Map<K, V> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC2261qf, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> c) {
        try {
            return super.removeAll((Collection) AbstractC1912ki.A04(c));
        } catch (UnsupportedOperationException unused) {
            return AbstractC2265qj.A0B(this, c.iterator());
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:567)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.AbstractC2261qf, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> c) {
        try {
            return super.retainAll((Collection) AbstractC1912ki.A04(c));
        } catch (UnsupportedOperationException unused) {
            HashSet A06 = AbstractC2265qj.A06(c.size());
            for (Object obj : c) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    A06.add(((Map.Entry) obj).getKey());
                }
            }
            return A00().keySet().retainAll(A06);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        A00().clear();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return A00().isEmpty();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BI != com.google.common.collect.Maps$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return A00().size();
    }
}
