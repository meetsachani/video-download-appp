package o;

import android.content.ContentResolver;
import android.content.UriMatcher;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.provider.ContactsContract;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: o.Id2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3227Id2 extends AbstractC7182j21<InputStream> {
    public static final int a1 = 1;
    public static final int b1 = 2;
    public static final int c1 = 3;
    public static final int d1 = 4;
    public static final int e1 = 5;
    public static final UriMatcher f1;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f1 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    public C3227Id2(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // o.InterfaceC9990uU
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // o.AbstractC7182j21
    /* renamed from: h */
    public void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // o.AbstractC7182j21
    /* renamed from: i */
    public InputStream f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        InputStream j = j(uri, contentResolver);
        if (j != null) {
            return j;
        }
        throw new FileNotFoundException("InputStream is null for " + uri);
    }

    public final InputStream j(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        int match = f1.match(uri);
        if (match != 1) {
            if (match != 3) {
                if (match != 5) {
                    if (this.X && C3829Oh1.d(uri) && C3829Oh1.c()) {
                        return l(uri, contentResolver);
                    }
                    return contentResolver.openInputStream(uri);
                }
            } else {
                return k(contentResolver, uri);
            }
        }
        Uri lookupContact = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (lookupContact != null) {
            return k(contentResolver, lookupContact);
        }
        throw new FileNotFoundException("Contact cannot be found");
    }

    public final InputStream k(ContentResolver contentResolver, Uri uri) {
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    public final InputStream l(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        AssetFileDescriptor h = C3829Oh1.h(uri, contentResolver);
        if (h != null) {
            try {
                return h.createInputStream();
            } catch (IOException e) {
                try {
                    h.close();
                } catch (Exception unused) {
                }
                throw ((FileNotFoundException) new FileNotFoundException("Unable to create stream").initCause(e));
            }
        }
        throw new FileNotFoundException("FileDescriptor is null for: " + uri);
    }

    public C3227Id2(ContentResolver contentResolver, Uri uri, boolean z) {
        super(contentResolver, uri, z);
    }
}
