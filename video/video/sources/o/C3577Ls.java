package o;

import java.io.IOException;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.ResourceBundle;

/* renamed from: o.Ls  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3577Ls implements Iterator<String[]> {
    public final C3968Ps X;
    public String[] Y;
    public Locale Z = Locale.getDefault();

    public C3577Ls(C3968Ps c3968Ps) throws IOException, C5817dS {
        this.X = c3968Ps;
        this.Y = c3968Ps.M();
    }

    @Override // java.util.Iterator
    /* renamed from: b */
    public String[] next() {
        String[] strArr = this.Y;
        try {
            this.Y = this.X.M();
            return strArr;
        } catch (IOException | C5817dS e) {
            NoSuchElementException noSuchElementException = new NoSuchElementException(e.getLocalizedMessage());
            noSuchElementException.initCause(e);
            throw noSuchElementException;
        }
    }

    public void c(Locale locale) {
        this.Z = (Locale) C11304zt1.t(locale, Locale.getDefault());
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.Y != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(ResourceBundle.getBundle(UI0.k, this.Z).getString("read.only.iterator"));
    }
}
