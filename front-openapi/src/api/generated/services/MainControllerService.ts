/* generated using openapi-typescript-codegen -- do not edit */
/* istanbul ignore file */
/* tslint:disable */
/* eslint-disable */
import type { ProductMiniResponse } from '../models/ProductMiniResponse';
import type { ProductRequest } from '../models/ProductRequest';
import type { ProductResponse } from '../models/ProductResponse';
import type { CancelablePromise } from '../core/CancelablePromise';
import { OpenAPI } from '../core/OpenAPI';
import { request as __request } from '../core/request';
export class MainControllerService {
    /**
     * @returns ProductMiniResponse OK
     * @throws ApiError
     */
    public static getAll(): CancelablePromise<Array<ProductMiniResponse>> {
        return __request(OpenAPI, {
            method: 'GET',
            url: '/api/products',
        });
    }
    /**
     * @param requestBody
     * @returns ProductResponse Product created
     * @throws ApiError
     */
    public static create(
        requestBody: ProductRequest,
    ): CancelablePromise<ProductResponse> {
        return __request(OpenAPI, {
            method: 'POST',
            url: '/api/products',
            body: requestBody,
            mediaType: 'application/json',
        });
    }
    /**
     * @param id
     * @returns ProductResponse OK
     * @throws ApiError
     */
    public static getById(
        id: number,
    ): CancelablePromise<ProductResponse> {
        return __request(OpenAPI, {
            method: 'GET',
            url: '/api/products/{id}',
            path: {
                'id': id,
            },
        });
    }
}
