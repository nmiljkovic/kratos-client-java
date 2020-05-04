/*
 * Ory Kratos
 * Welcome to the ORY Kratos HTTP API documentation!
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.kratos.api;

import sh.ory.kratos.ApiException;
import sh.ory.kratos.model.ErrorContainer;
import sh.ory.kratos.model.GenericError;
import sh.ory.kratos.model.LoginRequest;
import sh.ory.kratos.model.RegistrationRequest;
import sh.ory.kratos.model.SettingsRequest;
import sh.ory.kratos.model.VerificationRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CommonApi
 */
@Ignore
public class CommonApiTest {

    private final CommonApi api = new CommonApi();

    
    /**
     * 
     *
     * Get a traits schema definition
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSchemaTest() throws ApiException {
        String id = null;
        Object response = api.getSchema(id);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based login user flows
     *
     * This endpoint returns a login request&#39;s context with, for example, error details and other information.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes to prevent scanning attacks.  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserLoginRequestTest() throws ApiException {
        String request = null;
        LoginRequest response = api.getSelfServiceBrowserLoginRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based registration user flows
     *
     * This endpoint returns a registration request&#39;s context with, for example, error details and other information.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes to prevent scanning attacks.  More information can be found at [ORY Kratos User Login and User Registration Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-login-user-registration).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserRegistrationRequestTest() throws ApiException {
        String request = null;
        RegistrationRequest response = api.getSelfServiceBrowserRegistrationRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based settings flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos User Settings &amp; Profile Management Documentation](https://www.ory.sh/docs/next/kratos/self-service/flows/user-settings-profile-management).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceBrowserSettingsRequestTest() throws ApiException {
        String request = null;
        SettingsRequest response = api.getSelfServiceBrowserSettingsRequest(request);

        // TODO: test validations
    }
    
    /**
     * Get user-facing self-service errors
     *
     * This endpoint returns the error associated with a user-facing self service errors.  When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for CSRF to work. To prevent token scanning attacks, the public endpoint does not return 404 status codes to prevent scanning attacks.  More information can be found at [ORY Kratos User User Facing Error Documentation](https://www.ory.sh/docs/kratos/self-service/flows/user-facing-errors).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceErrorTest() throws ApiException {
        String error = null;
        ErrorContainer response = api.getSelfServiceError(error);

        // TODO: test validations
    }
    
    /**
     * Get the request context of browser-based verification flows
     *
     * When accessing this endpoint through ORY Kratos&#39; Public API, ensure that cookies are set as they are required for checking the auth session. To prevent scanning attacks, the public endpoint does not return 404 status codes but instead 403 or 500.  More information can be found at [ORY Kratos Email and Phone Verification Documentation](https://www.ory.sh/docs/kratos/selfservice/flows/verify-email-account-activation).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSelfServiceVerificationRequestTest() throws ApiException {
        String request = null;
        VerificationRequest response = api.getSelfServiceVerificationRequest(request);

        // TODO: test validations
    }
    
}
