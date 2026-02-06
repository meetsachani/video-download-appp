package o;

import java.io.File;
import java.io.Serializable;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* renamed from: o.kw1  reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C7643kw1 extends N0 implements EJ, Serializable {
    private static final long serialVersionUID = 5767770777065432721L;
    public final List<HJ0> Z;

    public C7643kw1() {
        this(0);
    }

    public static /* synthetic */ boolean t(Path path, BasicFileAttributes basicFileAttributes, HJ0 hj0) {
        FileVisitResult fileVisitResult;
        FileVisitResult a = hj0.a(path, basicFileAttributes);
        fileVisitResult = FileVisitResult.CONTINUE;
        if (a == fileVisitResult) {
            return true;
        }
        return false;
    }

    @Override // o.HJ0, o.InterfaceC6430fz1
    public FileVisitResult a(final Path path, final BasicFileAttributes basicFileAttributes) {
        return N0.p(this.Z.stream().anyMatch(new Predicate() { // from class: o.jw1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return C7643kw1.t(path, basicFileAttributes, (HJ0) obj);
            }
        }));
    }

    @Override // o.N0, o.HJ0, java.io.FileFilter
    public boolean accept(final File file) {
        return this.Z.stream().anyMatch(new Predicate() { // from class: o.gw1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean accept;
                accept = ((HJ0) obj).accept(file);
                return accept;
            }
        });
    }

    @Override // o.EJ
    public boolean b(HJ0 hj0) {
        return this.Z.remove(hj0);
    }

    @Override // o.EJ
    public void c(List<HJ0> list) {
        this.Z.clear();
        List<HJ0> list2 = this.Z;
        Objects.requireNonNull(list, "fileFilters");
        list2.addAll(list);
    }

    @Override // o.EJ
    public List<HJ0> f() {
        return Collections.unmodifiableList(this.Z);
    }

    @Override // o.EJ
    public void g(HJ0 hj0) {
        List<HJ0> list = this.Z;
        Objects.requireNonNull(hj0, "fileFilter");
        list.add(hj0);
    }

    @Override // o.N0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(C9811tl1.c);
        h(this.Z, sb);
        sb.append(C9811tl1.d);
        return sb.toString();
    }

    public void w(HJ0... hj0Arr) {
        Objects.requireNonNull(hj0Arr, "fileFilters");
        Stream.of((Object[]) hj0Arr).forEach(new Consumer() { // from class: o.hw1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C7643kw1.this.g((HJ0) obj);
            }
        });
    }

    public C7643kw1(ArrayList<HJ0> arrayList) {
        Objects.requireNonNull(arrayList, "initialList");
        this.Z = arrayList;
    }

    @Override // o.N0, o.HJ0, java.io.FilenameFilter
    public boolean accept(final File file, final String str) {
        return this.Z.stream().anyMatch(new Predicate() { // from class: o.iw1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                boolean accept;
                accept = ((HJ0) obj).accept(file, str);
                return accept;
            }
        });
    }

    public C7643kw1(int i) {
        this((ArrayList<HJ0>) new ArrayList(i));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7643kw1(HJ0... hj0Arr) {
        this(hj0Arr.length);
        Objects.requireNonNull(hj0Arr, "fileFilters");
        w(hj0Arr);
    }

    public C7643kw1(HJ0 hj0, HJ0 hj02) {
        this(2);
        g(hj0);
        g(hj02);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7643kw1(List<HJ0> list) {
        this((ArrayList<HJ0>) new ArrayList(list));
        Objects.requireNonNull(list, "fileFilters");
    }
}
