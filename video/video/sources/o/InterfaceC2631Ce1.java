package o;

import java.util.NoSuchElementException;

@Deprecated
/* renamed from: o.Ce1  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2631Ce1 {
    public static final InterfaceC2631Ce1 a = new a();

    long a();

    long b();

    boolean c();

    OU d();

    boolean next();

    void reset();

    /* renamed from: o.Ce1$a */
    /* loaded from: classes2.dex */
    public class a implements InterfaceC2631Ce1 {
        @Override // o.InterfaceC2631Ce1
        public long a() {
            throw new NoSuchElementException();
        }

        @Override // o.InterfaceC2631Ce1
        public long b() {
            throw new NoSuchElementException();
        }

        @Override // o.InterfaceC2631Ce1
        public boolean c() {
            return true;
        }

        @Override // o.InterfaceC2631Ce1
        public OU d() {
            throw new NoSuchElementException();
        }

        @Override // o.InterfaceC2631Ce1
        public boolean next() {
            return false;
        }

        @Override // o.InterfaceC2631Ce1
        public void reset() {
        }
    }
}
