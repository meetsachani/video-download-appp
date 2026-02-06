package o;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;

@InterfaceC7797la0
@InterfaceC11149zF0
/* renamed from: o.jB  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7216jB {
    public Writer a() throws IOException {
        Writer b = b();
        if (b instanceof BufferedWriter) {
            return (BufferedWriter) b;
        }
        return new BufferedWriter(b);
    }

    public abstract Writer b() throws IOException;

    public void c(CharSequence charSequence) throws IOException {
        C10664xF1.E(charSequence);
        try {
            Writer writer = (Writer) C8218nE.a().d(b());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    @InterfaceC6181ey
    public long d(Readable readable) throws IOException {
        C10664xF1.E(readable);
        try {
            Writer writer = (Writer) C8218nE.a().d(b());
            long b = C7963mB.b(readable, writer);
            writer.flush();
            return b;
        } finally {
        }
    }

    public void e(Iterable<? extends CharSequence> iterable) throws IOException {
        f(iterable, System.getProperty("line.separator"));
    }

    public void f(Iterable<? extends CharSequence> iterable, String str) throws IOException {
        C10664xF1.E(iterable);
        C10664xF1.E(str);
        try {
            Writer writer = (Writer) C8218nE.a().d(a());
            for (CharSequence charSequence : iterable) {
                writer.append(charSequence).append((CharSequence) str);
            }
            writer.flush();
        } finally {
        }
    }
}
